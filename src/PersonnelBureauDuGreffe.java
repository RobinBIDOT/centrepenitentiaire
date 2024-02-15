import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PersonnelBureauDuGreffe {
    private int id;
    private String nom;
    private String prenom;
    private List<Detenu> detenusDontIlSoccupe;

    public PersonnelBureauDuGreffe(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.detenusDontIlSoccupe = new ArrayList<>();
    }
    // Méthode pour ajouter un détenu à la liste
    public void ajouterDetenu(Detenu detenu) {
        this.detenusDontIlSoccupe.add(detenu);
    }

    // Méthode pour retirer un détenu de la liste
    public boolean retirerDetenu(Detenu detenu) {
        return this.detenusDontIlSoccupe.remove(detenu);
    }

    // Méthode pour obtenir la liste des détenus
    public List<Detenu> getDetenusDontIlSoccupe() {
        return new ArrayList<>(this.detenusDontIlSoccupe);
    }

    // Autres méthodes spécifiques au personnel du Bureau du Greffe
    // Méthode pour rechercher un détenu dans la base de données
    public void rechercherDetenu(String nom, String prenom) {
        // Connexion à la base de données
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/votre_base_de_donnees", "utilisateur", "mot_de_passe")) {
            // Requête SQL pour rechercher le détenu par nom et prénom
            String sql = "SELECT d.nomDetenu, d.prenomDetenu, d.dateNaissance, d.idDetenu, e.nomEtablissement " +
                    "FROM Detenu d " +
                    "INNER JOIN Etablissement e ON d.idEtablissement = e.idEtablissement " +
                    "WHERE d.nomDetenu = ? AND d.prenomDetenu = ?";

            // Préparation de la requête
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nom);
                statement.setString(2, prenom);

                // Exécution de la requête
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Liste pour stocker les résultats
                    List<String[]> resultList = new ArrayList<>();

                    // Parcourir les résultats
                    while (resultSet.next()) {
                        String[] detenuInfo = new String[5];
                        detenuInfo[0] = resultSet.getString("nomDetenu");
                        detenuInfo[1] = resultSet.getString("prenomDetenu");
                        detenuInfo[2] = resultSet.getDate("dateNaissance").toString();
                        detenuInfo[3] = String.valueOf(resultSet.getInt("idDetenu"));
                        detenuInfo[4] = resultSet.getString("nomEtablissement");
                        resultList.add(detenuInfo);
                    }

                    // Vérifier si la liste est vide
                    if (resultList.isEmpty()) {
                        System.out.println("La personne n'existe pas");
                    } else {
                        // Afficher les résultats
                        for (String[] detenuInfo : resultList) {
                            System.out.println("Nom: " + detenuInfo[0] + ", Prénom: " + detenuInfo[1] +
                                    ", Date de naissance: " + detenuInfo[2] + ", ID: " + detenuInfo[3] +
                                    ", Dernier établissement: " + detenuInfo[4]);
                        }
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour créer une fiche de détenu dans la base de données
    public void creerFicheDetenu(String nom, String prenom, String dateNaissance, String adresse, String debutPeine, String finPeine) {
        // Connexion à la base de données
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/votre_base_de_donnees", "utilisateur", "mot_de_passe")) {
            // Vérifier si la fiche pénale existe déjà
            int idFichePenale = chercherFichePenale(debutPeine, finPeine);

            // Si la fiche pénale n'existe pas, la créer
            if (idFichePenale == -1) {
                idFichePenale = creerFichePenale(debutPeine, finPeine, connection);
            }

            // Requête SQL pour insérer une nouvelle fiche de détenu
            String sql = "INSERT INTO Detenu (nomDetenu, prenomDetenu, dateNaissance, adresseCivile, debutPeine, finPeine, idFichePenale) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            // Préparation de la requête
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nom);
                statement.setString(2, prenom);
                statement.setString(3, dateNaissance);
                statement.setString(4, adresse);
                statement.setString(5, debutPeine);
                statement.setString(6, finPeine);
                statement.setInt(7, idFichePenale);

                // Exécution de la requête
                int rowsAffected = statement.executeUpdate();

                if (rowsAffected > 0) {
                    System.out.println("Fiche détenu créée avec succès.");
                } else {
                    System.out.println("Erreur lors de la création de la fiche détenu.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Méthode pour chercher une fiche pénale dans la base de données
    private int chercherFichePenale(String debutPeine, String finPeine) {
        // Connexion à la base de données
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/votre_base_de_donnees", "utilisateur", "mot_de_passe")) {
            // Requête SQL pour rechercher une fiche pénale par dates de début et de fin de peine
            String sql = "SELECT idFichePenale FROM FichePenale WHERE debutPeine = ? AND finPeine = ?";

            // Préparation de la requête
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, debutPeine);
                statement.setString(2, finPeine);

                // Exécution de la requête
                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        // Si une fiche pénale correspondante est trouvée, retourner son ID
                        return resultSet.getInt("idFichePenale");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // Si aucune fiche pénale correspondante n'est trouvée, retourner -1
        return -1;
    }

    // Méthode pour créer une nouvelle fiche pénale dans la base de données
    private int creerFichePenale(String debutPeine, String finPeine, Connection connection) throws SQLException {
        // Requête SQL pour insérer une nouvelle fiche pénale
        String sql = "INSERT INTO FichePenale (debutPeine, finPeine) VALUES (?, ?)";

        // Préparation de la requête
        try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            statement.setString(1, debutPeine);
            statement.setString(2, finPeine);

            // Exécution de la requête
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                // Récupérer l'ID généré pour la nouvelle fiche pénale
                try (ResultSet generatedKeys = statement.getGeneratedKeys()) {
                    if (generatedKeys.next()) {
                        return generatedKeys.getInt(1);
                    }
                }
            }
        }

        // En cas d'erreur, retourner -1
        return -1;
    }


}

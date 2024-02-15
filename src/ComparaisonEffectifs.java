import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ComparaisonEffectifs {

    public void comparerEffectifs() {
        // Connexion à la base de données
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/votre_base_de_donnees", "utilisateur", "mot_de_passe")) {
            // Requête SQL pour compter le nombre de détenus gérés par le greffe
            String sqlTotalGreffe = "SELECT COUNT(*) AS totalDetenusGreffe FROM Detenu";

            // Requête SQL pour compter le nombre de détenus en détention
            String sqlTotalDetention = "SELECT COUNT(*) AS totalDetenusDetention FROM Detenu";

            // Préparation et exécution de la requête pour le greffe
            try (PreparedStatement statementTotalGreffe = connection.prepareStatement(sqlTotalGreffe)) {
                ResultSet resultSetTotalGreffe = statementTotalGreffe.executeQuery();

                // Récupération du résultat pour le greffe
                int totalDetenusGreffe = 0;
                if (resultSetTotalGreffe.next()) {
                    totalDetenusGreffe = resultSetTotalGreffe.getInt("totalDetenusGreffe");
                }

                // Préparation et exécution de la requête pour la détention
                try (PreparedStatement statementTotalDetention = connection.prepareStatement(sqlTotalDetention)) {
                    ResultSet resultSetTotalDetention = statementTotalDetention.executeQuery();

                    // Récupération du résultat pour la détention
                    int totalDetenusDetention = 0;
                    if (resultSetTotalDetention.next()) {
                        totalDetenusDetention = resultSetTotalDetention.getInt("totalDetenusDetention");
                    }

                    // Comparaison des effectifs
                    if (totalDetenusGreffe != totalDetenusDetention) {
                        System.out.println("Erreur: différence dans les effectifs");
                    } else {
                        System.out.println("Les effectifs sont équilibrés");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

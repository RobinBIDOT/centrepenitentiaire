import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EtatEffectifsGreffe {

    public void etatEffectifsGreffe() {
        // Connexion à la base de données
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/votre_base_de_donnees", "utilisateur", "mot_de_passe")) {
            // Requête SQL pour compter le nombre de détenus gérés par le greffe
            String sqlTotalGreffe = "SELECT COUNT(*) AS totalDetenusGreffe FROM Detenu";

            // Préparation et exécution de la requête
            try (PreparedStatement statementTotalGreffe = connection.prepareStatement(sqlTotalGreffe)) {

                ResultSet resultSetTotalGreffe = statementTotalGreffe.executeQuery();

                // Récupération du résultat
                int totalDetenusGreffe = 0;

                if (resultSetTotalGreffe.next()) {
                    totalDetenusGreffe = resultSetTotalGreffe.getInt("totalDetenusGreffe");
                }

                // Affichage du résultat
                System.out.println("Total détenus gérés par le greffe: " + totalDetenusGreffe);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

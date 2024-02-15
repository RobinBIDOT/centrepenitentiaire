import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EtatEffectifs {

    public void etatEffectifsDetention() {
        // Connexion à la base de données
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/votre_base_de_donnees", "utilisateur", "mot_de_passe")) {
            // Requête SQL pour compter le nombre total de détenus
            String sqlTotal = "SELECT COUNT(*) AS totalDetenus FROM Detenu";
            // Requête SQL pour compter le nombre de détenus en détention
            String sqlDetention = "SELECT COUNT(*) AS totalDetention FROM Detenu WHERE semiLibre = 0";
            // Requête SQL pour compter le nombre de détenus en semi-liberté
            String sqlSemiLiberte = "SELECT COUNT(*) AS totalSemiLiberte FROM Detenu WHERE semiLibre = 1";

            // Préparation et exécution des requêtes
            try (PreparedStatement statementTotal = connection.prepareStatement(sqlTotal);
                 PreparedStatement statementDetention = connection.prepareStatement(sqlDetention);
                 PreparedStatement statementSemiLiberte = connection.prepareStatement(sqlSemiLiberte)) {

                ResultSet resultSetTotal = statementTotal.executeQuery();
                ResultSet resultSetDetention = statementDetention.executeQuery();
                ResultSet resultSetSemiLiberte = statementSemiLiberte.executeQuery();

                // Récupération des résultats
                int totalDetenus = 0;
                int totalDetention = 0;
                int totalSemiLiberte = 0;

                if (resultSetTotal.next()) {
                    totalDetenus = resultSetTotal.getInt("totalDetenus");
                }

                if (resultSetDetention.next()) {
                    totalDetention = resultSetDetention.getInt("totalDetention");
                }

                if (resultSetSemiLiberte.next()) {
                    totalSemiLiberte = resultSetSemiLiberte.getInt("totalSemiLiberte");
                }

                // Affichage des résultats
                System.out.println("Total détenus: " + totalDetenus);
                System.out.println("En détention: " + totalDetention);
                System.out.println("En semi-liberté: " + totalSemiLiberte);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

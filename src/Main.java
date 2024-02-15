import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Formater la date d'ouverture de l'établissement
        Date dateOuverture = CalculDuree.formaterDate("15.04.1968");
        // Création de l'établissement
        Etablissement centrePenitentiaireProgrammeur = new Etablissement(
                1,
                dateOuverture,
                null,
                "CP-Programmeur",
                500,
                500
        );

        // Création du bâtiment
        Batiment batimentHomme = new Batiment(1, 1, "BatimentHomme");

        // Création des quartiers
        Quartier qpm = new Quartier("QPM", "Quartier pour Mineur");
        Quartier qma = new Quartier("QMA", "Quartier Maison d’Arrêt");
        Quartier qcd = new Quartier("QCD", "Quartier Centre de Détention");
        Quartier qhs = new Quartier("QHS", "Quartier Haute Sécurité");

        // Ajouter les quartiers au bâtiment
        // Assurez-vous d'avoir une méthode dans Batiment pour ajouter des quartiers
        batimentHomme.ajouterQuartier(qpm);
        batimentHomme.ajouterQuartier(qma);
        batimentHomme.ajouterQuartier(qcd);
        batimentHomme.ajouterQuartier(qhs);

        // Ajouter le bâtiment à l'établissement
        // Assurez-vous d'avoir une méthode dans Etablissement pour ajouter des bâtiments
        centrePenitentiaireProgrammeur.ajouterBatiment(batimentHomme);

        // Afficher les informations (si vous avez des méthodes pour cela)
        centrePenitentiaireProgrammeur.afficherInfos();


//        // Création des cellules pour le quartier QPM
//        Cellule celluleMineur101 = new Cellule(/* id pour Cellule-Mineur-101 */, "QPM", /* capacité */);
//        Cellule celluleMineur102 = new Cellule(/* id pour Cellule-Mineur-102 */, "QPM", /* capacité */);
//
//        // Ajout des détenus (représentés par des ID) dans les cellules
//        // Supposons que M1, M2, M3 sont représentés par des ID entiers
//        int idDetenuM1 = /* ID pour M1 */;
//        int idDetenuM2 = /* ID pour M2 */;
//        int idDetenuM3 = /* ID pour M3 */;
//
//        celluleMineur101.ajouterDetenu(idDetenuM1); // Ajouter M1 à Cellule-Mineur-101
//        celluleMineur102.ajouterDetenu(idDetenuM2); // Ajouter M2 à Cellule-Mineur-102
//        celluleMineur102.ajouterDetenu(idDetenuM3); // Ajouter M3 à Cellule-Mineur-102
//
//        // Ajouter les cellules au quartier QPM
//        qpm.ajouterCellule(celluleMineur101);
//        qpm.ajouterCellule(celluleMineur102);
//
//        // Ajout de cellules au quartier QMA
//        Cellule cellule110 = new Cellule(/* id pour Cellule-110 */, "QMA", /* capacité */);
//        cellule110.ajouterDetenu(/* ID pour A1 */);
//        cellule110.ajouterDetenu(/* ID pour A2 */);
//        qma.ajouterCellule(cellule110);
//
//        Cellule cellule111 = new Cellule(/* id pour Cellule-111 */, "QMA", /* capacité */);
//        cellule111.ajouterDetenu(/* ID pour A3 */);
//        qma.ajouterCellule(cellule111);
//
//        // Ajout de cellules au quartier QCD
//        Cellule cellule120 = new Cellule(/* id pour Cellule-120 */, "QCD", /* capacité */);
//        cellule120.ajouterDetenu(/* ID pour A4 */);
//        cellule120.ajouterDetenu(/* ID pour A5 */);
//        cellule120.ajouterDetenu(/* ID pour A6 */);
//        cellule120.ajouterDetenu(/* ID pour A7 */);
//        qcd.ajouterCellule(cellule120);
//
//        Cellule cellule121 = new Cellule(/* id pour Cellule-121 */, "QCD", /* capacité */);
//        qcd.ajouterCellule(cellule121);
//
//        // Ajout de cellules au quartier QHS
//        Cellule cellule130 = new Cellule(/* id pour Cellule-130 */, "QHS", /* capacité */);
//        Cellule cellule131 = new Cellule(/* id pour Cellule-131 */, "QHS", /* capacité */);
//        qhs.ajouterCellule(cellule130);
//        qhs.ajouterCellule(cellule131);
    }

}

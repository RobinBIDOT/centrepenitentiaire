import java.util.ArrayList;
import java.util.List;

public class Quartier {
    private String nomQuartier;
    private String typeQuartier; // Exemples: QMA, QCD, QMC, QPM, QHS
    private int idBatiment;
    private int idQuartier;

    private List<Cellule> cellules;

    public Quartier(String nomQuartier, String typeQuartier) {
        this.nomQuartier = nomQuartier;
        this.typeQuartier = typeQuartier;
        this.idBatiment = idBatiment;
        this.idQuartier = idQuartier;
        cellules = new ArrayList<>();
    }

    public void ajouterCellule(Cellule cellule) {
        cellules.add(cellule);
    }

    // Getters et setters pour les attributs
    public String getNomQuartier() {
        return nomQuartier;
    }

    public void setNomQuartier(String nomQuartier) {
        this.nomQuartier = nomQuartier;
    }

    public String getTypeQuartier() {
        return typeQuartier;
    }

    public void setTypeQuartier(String typeQuartier) {
        this.typeQuartier = typeQuartier;
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public int getIdQuartier() {
        return idQuartier;
    }

    public void setIdQuartier(int idQuartier) {
        this.idQuartier = idQuartier;
    }

    public void setCellules(List<Cellule> cellules) {
        this.cellules = cellules;
    }

    public List<Cellule> getCellules() {
        return cellules;
    }

    // Méthode pour afficher les informations du quartier
    public void afficherInfos() {
        System.out.println("Quartier: " + nomQuartier + " (" + typeQuartier + ")");
        for (Cellule cellule : cellules) {
            // Ici, implémentez la méthode d'affichage de la cellule
            cellule.afficherInfos();
        }
    }
}

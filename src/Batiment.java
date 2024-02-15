import java.util.ArrayList;
import java.util.List;

public class Batiment {
    private int idBatiment;
    private int idEtablissement;
    private String nomBatiment;
    private List<Quartier> quartiers;

    // Constructeur
    public Batiment(int idBatiment, int idEtablissement, String nomBatiment) {
        this.idBatiment = idBatiment;
        this.idEtablissement = idEtablissement;
        this.nomBatiment = nomBatiment;
        this.quartiers = new ArrayList<>();
    }

    // Getters et setters
    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public String getNomBatiment() {
        return nomBatiment;
    }

    public void setNomBatiment(String nomBatiment) {
        this.nomBatiment = nomBatiment;
    }

    // Méthode pour ajouter un quartier
    public void ajouterQuartier(Quartier quartier) {
        quartiers.add(quartier);
    }
    public List<Quartier> getQuartiers() {
        return quartiers;
    }
}

public class Batiment {
    private int idBatiment;
    private int idEtablissement;
    private String nomBatiment;

    // Constructeur
    public Batiment(int idBatiment, int idEtablissement, String nomBatiment) {
        this.idBatiment = idBatiment;
        this.idEtablissement = idEtablissement;
        this.nomBatiment = nomBatiment;
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
}

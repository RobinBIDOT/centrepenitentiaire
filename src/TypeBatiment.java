public class TypeBatiment {
    private int idBatiment;
    private String typeBatiment;
    private boolean mineurBatiment;
    private String sexeBatiment;

    // Constructeur
    public TypeBatiment(int idBatiment, String typeBatiment, boolean mineurBatiment, String sexeBatiment) {
        this.idBatiment = idBatiment;
        this.typeBatiment = typeBatiment;
        this.mineurBatiment = mineurBatiment;
        this.sexeBatiment = sexeBatiment;
    }

    // Getters et setters
    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public String getTypeBatiment() {
        return typeBatiment;
    }

    public void setTypeBatiment(String typeBatiment) {
        this.typeBatiment = typeBatiment;
    }

    public boolean isMineurBatiment() {
        return mineurBatiment;
    }

    public void setMineurBatiment(boolean mineurBatiment) {
        this.mineurBatiment = mineurBatiment;
    }

    public String getSexeBatiment() {
        return sexeBatiment;
    }

    public void setSexeBatiment(String sexeBatiment) {
        this.sexeBatiment = sexeBatiment;
    }
}

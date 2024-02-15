import java.util.Date;

public class Activite {
    private int idActivite;
    private String libelleActivite;
    private Date heureDebut;
    private int duree; // Durée en minutes

    // Constructeur
    public Activite(int idActivite, String libelleActivite, Date heureDebut, int duree) {
        this.idActivite = idActivite;
        this.libelleActivite = libelleActivite;
        this.heureDebut = heureDebut;
        this.duree = duree;
    }

    // Getters et setters
    public int getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(int idActivite) {
        this.idActivite = idActivite;
    }

    public String getLibelleActivite() {
        return libelleActivite;
    }

    public void setLibelleActivite(String libelleActivite) {
        this.libelleActivite = libelleActivite;
    }

    public Date getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(Date heureDebut) {
        this.heureDebut = heureDebut;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    // Autres méthodes
    // ...
}

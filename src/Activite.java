import java.time.Duration;
import java.util.Date;

public class Activite {
    private int idActivite;
    private String libelleActivite;
    private Date heureDebut;
    private Duration duree;

    // Constructeur
    public Activite(int idActivite, String libelleActivite, Date heureDebut, Duration duree) {
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

    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }
}

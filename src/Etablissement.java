import java.util.Date;

public class Etablissement {
    private int idEtablissement;
    private Date dateOuverture;
    private Date dateFermeture;
    private String nomEtablissement;
    private int nbDetenuGreffe;
    private int nbDetenuDetention;

    // Constructeur
    public Etablissement(int idEtablissement, Date dateOuverture, Date dateFermeture,
                         String nomEtablissement, int nbDetenuGreffe, int nbDetenuDetention) {
        this.idEtablissement = idEtablissement;
        this.dateOuverture = dateOuverture;
        this.dateFermeture = dateFermeture;
        this.nomEtablissement = nomEtablissement;
        this.nbDetenuGreffe = nbDetenuGreffe;
        this.nbDetenuDetention = nbDetenuDetention;
    }

    // Getters et setters
    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public Date getDateFermeture() {
        return dateFermeture;
    }

    public void setDateFermeture(Date dateFermeture) {
        this.dateFermeture = dateFermeture;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    public int getNbDetenuGreffe() {
        return nbDetenuGreffe;
    }

    public void setNbDetenuGreffe(int nbDetenuGreffe) {
        this.nbDetenuGreffe = nbDetenuGreffe;
    }

    public int getNbDetenuDetention() {
        return nbDetenuDetention;
    }

    public void setNbDetenuDetention(int nbDetenuDetention) {
        this.nbDetenuDetention = nbDetenuDetention;
    }
}

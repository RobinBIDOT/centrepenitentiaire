import java.util.Date;

public class Detenu {
    private int idDetenu;
    private String nomDetenu;
    private String prenomDetenu;
    private Date dateNaissance;
    private String adresseCivile;
    private int idEtablissement;
    private int idBatiment;
    private int idFichePenale;
    private boolean semiLibre;
    private int idActivite;
    private boolean estDangereux;

    // Constructeur
    public Detenu(int idDetenu, String nomDetenu, String prenomDetenu, Date dateNaissance, String adresseCivile,
                  int idEtablissement, int idBatiment, int idFichePenale, boolean semiLibre, int idActivite) {
        this.idDetenu = idDetenu;
        this.nomDetenu = nomDetenu;
        this.prenomDetenu = prenomDetenu;
        this.dateNaissance = dateNaissance;
        this.adresseCivile = adresseCivile;
        this.idEtablissement = idEtablissement;
        this.idBatiment = idBatiment;
        this.idFichePenale = idFichePenale;
        this.semiLibre = semiLibre;
        this.idActivite = idActivite;
        this.estDangereux = estDangereux;
    }

    // Getters et setters
    public int getIdDetenu() {
        return idDetenu;
    }

    public void setIdDetenu(int idDetenu) {
        this.idDetenu = idDetenu;
    }

    public String getNomDetenu() {
        return nomDetenu;
    }

    public void setNomDetenu(String nomDetenu) {
        this.nomDetenu = nomDetenu;
    }

    public String getPrenomDetenu() {
        return prenomDetenu;
    }

    public void setPrenomDetenu(String prenomDetenu) {
        this.prenomDetenu = prenomDetenu;
    }

    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getAdresseCivile() {
        return adresseCivile;
    }

    public void setAdresseCivile(String adresseCivile) {
        this.adresseCivile = adresseCivile;
    }

    public int getIdEtablissement() {
        return idEtablissement;
    }

    public void setIdEtablissement(int idEtablissement) {
        this.idEtablissement = idEtablissement;
    }

    public int getIdBatiment() {
        return idBatiment;
    }

    public void setIdBatiment(int idBatiment) {
        this.idBatiment = idBatiment;
    }

    public int getIdFichePenale() {
        return idFichePenale;
    }

    public void setIdFichePenale(int idFichePenale) {
        this.idFichePenale = idFichePenale;
    }

    public boolean isSemiLibre() {
        return semiLibre;
    }

    public void setSemiLibre(boolean semiLibre) {
        this.semiLibre = semiLibre;
    }

    public int getIdActivite() {
        return idActivite;
    }

    public void setIdActivite(int idActivite) {
        this.idActivite = idActivite;
    }

    public boolean isEstDangereux() {
        return estDangereux;
    }

    public void setEstDangereux(boolean estDangereux) {
        this.estDangereux = estDangereux;
    }
}

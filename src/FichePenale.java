import java.util.Date;

public class FichePenale {
    private int idFichePenale;
    private Date debutPeine;
    private Date finPeine;

    // Constructeur
    public FichePenale(int idFichePenale, Date debutPeine, Date finPeine) {
        this.idFichePenale = idFichePenale;
        this.debutPeine = debutPeine;
        this.finPeine = finPeine;
    }

    // Getters et setters
    public int getIdFichePenale() {
        return idFichePenale;
    }

    public void setIdFichePenale(int idFichePenale) {
        this.idFichePenale = idFichePenale;
    }

    public Date getDebutPeine() {
        return debutPeine;
    }

    public void setDebutPeine(Date debutPeine) {
        this.debutPeine = debutPeine;
    }

    public Date getFinPeine() {
        return finPeine;
    }

    public void setFinPeine(Date finPeine) {
        this.finPeine = finPeine;
    }
}

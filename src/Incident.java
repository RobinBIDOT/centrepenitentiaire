import java.util.Date;
import java.util.List;

public class Incident {
    private int idIncident;
    private Date dateIncident;
    private String description;
    private int idPersonnelBureauDeLaDetention; // Nouvel attribut
    private List<Integer> idsDetenus; // Nouvel attribut

    // Constructeur
    public Incident(int idIncident, Date dateIncident, String description,
                    int idPersonnelBureauDeLaDetention, List<Integer> idsDetenus) {
        this.idIncident = idIncident;
        this.dateIncident = dateIncident;
        this.description = description;
        this.idPersonnelBureauDeLaDetention = idPersonnelBureauDeLaDetention;
        this.idsDetenus = idsDetenus;
    }

    // Getters et setters
    public int getIdIncident() {
        return idIncident;
    }

    public void setIdIncident(int idIncident) {
        this.idIncident = idIncident;
    }

    public Date getDateIncident() {
        return dateIncident;
    }

    public void setDateIncident(Date dateIncident) {
        this.dateIncident = dateIncident;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIdPersonnelBureauDeLaDetention() {
        return idPersonnelBureauDeLaDetention;
    }

    public void setIdPersonnelBureauDeLaDetention(int idPersonnelBureauDeLaDetention) {
        this.idPersonnelBureauDeLaDetention = idPersonnelBureauDeLaDetention;
    }

    public List<Integer> getIdsDetenus() {
        return idsDetenus;
    }

    public void setIdsDetenus(List<Integer> idsDetenus) {
        this.idsDetenus = idsDetenus;
    }

    // Autres méthodes
    // ...
}

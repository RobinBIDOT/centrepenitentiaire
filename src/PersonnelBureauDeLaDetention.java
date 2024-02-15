import java.util.List;
import java.util.ArrayList;

public class PersonnelBureauDeLaDetention {
    private int id;
    private String nom;
    private String prenom;
    private List<Detenu> detenusDontIlSoccupe;

    public PersonnelBureauDeLaDetention(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.detenusDontIlSoccupe = new ArrayList<>();
    }

    // Méthode pour ajouter un détenu à la liste
    public void ajouterDetenu(Detenu detenu) {
        this.detenusDontIlSoccupe.add(detenu);
    }

    // Méthode pour retirer un détenu de la liste
    public boolean retirerDetenu(Detenu detenu) {
        return this.detenusDontIlSoccupe.remove(detenu);
    }

    // Méthode pour obtenir la liste des détenus
    public List<Detenu> getDetenusDontIlSoccupe() {
        return new ArrayList<>(this.detenusDontIlSoccupe);
    }

    // Autres méthodes spécifiques au personnel du Bureau de la Détention
    // ...
}

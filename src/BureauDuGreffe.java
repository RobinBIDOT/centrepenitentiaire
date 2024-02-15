import java.util.ArrayList;
import java.util.List;

public class BureauDuGreffe extends EntiteAdministrationPenitentiaire {
    private List<PersonnelBureauDuGreffe> personnels;

    public BureauDuGreffe(String nom) {
        super(nom, "BureauDuGreffe");
        // Initialisation des personnels
        this.personnels = new ArrayList<>();
    }
    // Méthode pour ajouter un personnel
    public void ajouterPersonnel(PersonnelBureauDuGreffe personnel) {
        this.personnels.add(personnel);
    }

    // Méthode pour retirer un personnel
    public boolean retirerPersonnel(PersonnelBureauDuGreffe personnel) {
        return this.personnels.remove(personnel);
    }

    // Méthode pour obtenir la liste des personnels
    public List<PersonnelBureauDuGreffe> getPersonnels() {
        return new ArrayList<>(this.personnels);
    }

    // Autres méthodes spécifiques au Bureau du Greffe
    // Méthode pour rechercher un détenu dans la base de données

}

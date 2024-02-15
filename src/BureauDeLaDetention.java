import java.util.List;
import java.util.ArrayList;

public class BureauDeLaDetention extends EntiteAdministrationPenitentiaire {
    private List<PersonnelBureauDeLaDetention> personnels;

    public BureauDeLaDetention(String nom) {
        super(nom, "BureauDeLaDetention");
        // Initialisation des personnels
        this.personnels = new ArrayList<>();
    }

    // Méthode pour ajouter un personnel
    public void ajouterPersonnel(PersonnelBureauDeLaDetention personnel) {
        this.personnels.add(personnel);
    }

    // Méthode pour retirer un personnel
    public boolean retirerPersonnel(PersonnelBureauDeLaDetention personnel) {
        return this.personnels.remove(personnel);
    }

    // Méthode pour obtenir la liste des personnels
    public List<PersonnelBureauDeLaDetention> getPersonnels() {
        return new ArrayList<>(this.personnels);
    }

    // Autres méthodes spécifiques au Bureau de la Détention
    // ...
}

import java.util.ArrayList;
import java.util.List;

public class AdministrationPenitentiaire {
    private List<EntiteAdministrationPenitentiaire> entites;

    public AdministrationPenitentiaire() {
        // Initialisation de la liste des entités
        this.entites = new ArrayList<>();
    }

    // Méthode pour ajouter une entité
    public void ajouterEntite(EntiteAdministrationPenitentiaire entite) {
        entites.add(entite);
    }

    // Méthode pour retirer une entité
    public boolean retirerEntite(EntiteAdministrationPenitentiaire entite) {
        return entites.remove(entite);
    }

    // Méthode pour obtenir la liste des entités
    public List<EntiteAdministrationPenitentiaire> getEntites() {
        return new ArrayList<>(entites);
    }

    // D'autres méthodes potentielles pour la gestion des entités
    // ...
}

import java.util.ArrayList;
import java.util.List;

public class Cellule {
    private int idCellule;
    private List<Integer> idsDetenus; // IDs des détenus dans la cellule
    private String typeCellule; // Par exemple, QMA, QCD, QMC, etc.
    private int capacite; // Nombre maximum de détenus que la cellule peut accueillir
    private boolean estPleine; // Indique si la cellule est pleine ou non

    public Cellule(int idCellule, String typeCellule, int capacite) {
        this.idCellule = idCellule;
        this.typeCellule = typeCellule;
        this.capacite = capacite;
        this.idsDetenus = new ArrayList<>();
        this.estPleine = false;
    }

    // Méthodes pour ajouter ou retirer un détenu, vérifier si la cellule est pleine, etc.
    // ...

    // Getters et setters
    // ...
}

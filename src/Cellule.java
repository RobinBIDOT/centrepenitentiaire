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

    public void ajouterDetenu(int idDetenu) {
        if (!estPleine) {
            idsDetenus.add(idDetenu);
            estPleine = idsDetenus.size() == capacite;
        } else {
            System.out.println("La cellule est pleine.");
        }
    }

    public void retirerDetenu(int idDetenu) {
        if (idsDetenus.remove(Integer.valueOf(idDetenu))) {
            estPleine = false;
        } else {
            System.out.println("Le détenu n'est pas dans cette cellule.");
        }
    }

    public boolean estCellulePleine() {
        return estPleine;
    }

    // Getters et setters
    public int getIdCellule() {
        return idCellule;
    }

    public void setIdCellule(int idCellule) {
        this.idCellule = idCellule;
    }

    public String getTypeCellule() {
        return typeCellule;
    }

    public void setTypeCellule(String typeCellule) {
        this.typeCellule = typeCellule;
    }

    public int getCapacite() {
        return capacite;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public List<Integer> getIdsDetenus() {
        return idsDetenus;
    }

    public void afficherInfos() {
        System.out.println("ID de la Cellule: " + idCellule);
        System.out.println("Type de Cellule: " + typeCellule);
        System.out.println("Capacité de la Cellule: " + capacite);
        System.out.println("La cellule est-elle pleine ? " + (estPleine ? "Oui" : "Non"));
        System.out.print("IDs des détenus dans la cellule: ");
        for (int idDetenu : idsDetenus) {
            System.out.print(idDetenu + " ");
        }
        System.out.println(); // Pour ajouter une nouvelle ligne à la fin
    }

}

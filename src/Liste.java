import java.util.ArrayList;
import java.util.List;

public class Liste<T> {
    private List<T> elements;

    // Constructeur d’une liste vide
    public Liste() {
        this.elements = new ArrayList<>();
    }

    // Constructeur d’une liste de n éléments, initialement tous à null
    public Liste(int n) {
        this.elements = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            this.elements.add(null);
        }
    }

    // Retourne l’objet situé à la position donnée en paramètre
    public T get(int position) {
        return this.elements.get(position);
    }

    // Affecte unObjet à l’élément à la position donnée
    public void set(T unObjet, int position) {
        if (position >= this.elements.size()) {
            // Étendre la liste pour accueillir l'élément à la position donnée
            for (int i = this.elements.size(); i <= position; i++) {
                this.elements.add(null);
            }
        }
        this.elements.set(position, unObjet);
    }

    // Ajoute un nouvel objet à la fin de la liste
    public void ajouter(T unObjet) {
        this.elements.add(unObjet);
    }
}

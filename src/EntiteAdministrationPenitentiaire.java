public abstract class EntiteAdministrationPenitentiaire {
    protected int id;
    protected String nom;
    protected String typeEntite;

    public EntiteAdministrationPenitentiaire(String nom, String typeEntite) {
        this.nom = nom;
        this.typeEntite = typeEntite;
    }

    // Méthodes communes à toutes les entités
    // ...
}
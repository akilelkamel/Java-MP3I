
public class Produit {

    protected String nom;
    protected double prix;

    public Produit(String nom, double prix) {
        this.nom = nom;
        this.prix = prix;
    }

    public void afficherProduit() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix: " + prix);
    }
}

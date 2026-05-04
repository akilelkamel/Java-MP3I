
public class ProduitAlimentaire extends Produit {

    private String dateExpiration;

    public ProduitAlimentaire(String nom, double prix, String dateExpiration) {
        super(nom, prix);
        this.dateExpiration = dateExpiration;
    }

    @Override
    public void afficherProduit() {
        super.afficherProduit();
        System.out.println("Date expiration: " + dateExpiration);
    }
}

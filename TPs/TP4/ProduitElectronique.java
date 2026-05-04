
public class ProduitElectronique extends Produit {

    private int garantie;

    public ProduitElectronique(String nom, double prix, int garantie) {
        super(nom, prix);
        this.garantie = garantie;
    }

    @Override
    public void afficherProduit() {
        super.afficherProduit();
        System.out.println("Garantie: " + garantie + " mois");
    }
}

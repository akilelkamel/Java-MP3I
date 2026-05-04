
public class TestExercice4 {

    public static void main(String[] args) {
        Produit p1 = new ProduitElectronique("TV", 1500, 24);
        Produit p2 = new ProduitAlimentaire("Lait", 2.5, "10/06/2026");

        p1.afficherProduit();
        System.out.println("------------");
        p2.afficherProduit();
    }
}

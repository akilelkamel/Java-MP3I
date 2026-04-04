
public class TestCercle {

    public static void main(String[] args) {
        // Création de deux cercles
        Cercle c1 = new Cercle(new Point(2, 3), 5);
        Cercle c2 = new Cercle(); // centre (0,0), rayon = 1

        // Affichage des cercles
        System.out.println("=== Cercle 1 ===");
        c1.afficher();

        System.out.println("\n=== Cercle 2 ===");
        c2.afficher();
    }
}

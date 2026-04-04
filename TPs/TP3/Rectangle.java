
public class Rectangle {

    // Attributs
    private double longueur;
    private double largeur;

    // Constructeur
    public Rectangle(double lon, double lar) {
        longueur = lon;
        largeur = lar;
    }

    // Méthode surface
    public double surface() {
        return longueur * largeur;
    }

    // Méthode périmètre
    public double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Rectangle : ");
        System.out.println("  Longueur  = " + longueur);
        System.out.println("  Largeur   = " + largeur);
        System.out.println("  Surface   = " + surface());
        System.out.println("  Périmètre = " + perimetre());
    }
}

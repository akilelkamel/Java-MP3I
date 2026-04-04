
public class Cercle {

    // Attributs
    private Point centre;
    private double rayon;

    // Constructeur avec paramètres
    public Cercle(Point c, double r) {
        centre = c;
        rayon = r;
    }

    // Constructeur sans paramètres
    public Cercle() {
        this.centre = new Point(0, 0);
        this.rayon = 1.0;
    }

    // Getter et Setter du centre
    public Point getCentre() {
        return centre;
    }

    public void setCentre(Point centre) {
        this.centre = centre;
    }

    // Getter et Setter du rayon
    public double getRayon() {
        return rayon;
    }

    public void setRayon(double r) {
        rayon = r;
    }

    // Méthode surface
    public double surface() {
        return Math.PI * rayon * rayon;
    }

    // Méthode périmètre
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

    // Méthode afficher
    public void afficher() {
        System.out.print("Cercle de centre ");
        centre.afficher();
        System.out.println("Et de rayon " + rayon);
        System.out.println("Surface : " + surface());
        System.out.println("Périmètre : " + perimetre());
    }
}

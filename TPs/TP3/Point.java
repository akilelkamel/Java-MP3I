
public class Point {

    // Attributs
    private double x;
    private double y;

    // Constructeur sans paramètres
    public Point() {
        x = 0;
        y = 0;
    }

    // Constructeur avec paramètres
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters et Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Méthode pour calculer la distance avec un autre point
    public double distance(Point autre) {
        double dx = x - autre.x;
        double dy = y - autre.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    // Méthode pour afficher les coordonnées du point
    public void afficher() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

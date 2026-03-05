
public class Cercle {

    private int rayon;
    private Point centre;

    public Cercle(int r, Point c) {
        rayon = r;
        centre = c;
    }

    public Cercle() {
        rayon = 1;
        centre = new Point();
    }

    public double surface() {
        return Math.PI * rayon * rayon;
    }

    public double perimetre() {
        return 2 * Math.PI * rayon;
    }

}

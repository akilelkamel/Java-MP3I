
public class Point {

    private int x;
    private int y;

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public void afficher() {
        System.out.println("(" + x + ", " + y + ")");
    }

}

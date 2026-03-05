
public class TestCercle {

    public static void main(String[] args) {
        Point p1 = new Point(3, 4);
        Cercle c1 = new Cercle(5, p1);

        System.out.println(c1.perimetre());
        System.out.println(c1.surface());

        Cercle c2 = new Cercle();
        System.out.println(c2.perimetre());
        System.out.println(c2.surface());
    }
}

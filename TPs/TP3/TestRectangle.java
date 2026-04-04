
public class TestRectangle {

    public static void main(String[] args) {
        // Création de plusieurs rectangles
        Rectangle[] rectangles = new Rectangle[3];
        rectangles[0] = new Rectangle(4, 2);
        rectangles[1] = new Rectangle(5.5, 3);
        rectangles[2] = new Rectangle(10, 6);

        // Parcours du tableau et affichage
        for (int i = 0; i < rectangles.length; i++) {
            rectangles[i].afficher();
            System.out.println("----------------------");
        }
    }
}

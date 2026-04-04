
public class TestPoint {

    public static void main(String[] args) {
        // Création de quelques points
        Point p1 = new Point(); // (0, 0)
        Point p2 = new Point(3, 4);
        Point p3 = new Point(5, 1);

        // Test de la méthode distance
        System.out.println("Distance entre p1 et p2 : " + p1.distance(p2));
        System.out.println("Distance entre p1 et p3 : " + p3.distance(p1));
        System.out.println("Distance entre p2 et p3 : " + p2.distance(p3));       
        
        
        // Tableau de points
        Point[] points = new Point[3];
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;

        // Affichage de tous les points
        System.out.println("\nListe des points :");
        for (int i = 0; i < points.length; i++) {
            points[i].afficher();
        }
    }
}

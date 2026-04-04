
public class TestScore {

    public static void main(String[] args) {
        // Création de joueurs
        Score joueur1 = new Score("Ahmed", 10);
        Score joueur2 = new Score("Amine"); // score = 0
        Score joueur3 = new Score("Sirine", 25);

        // Affichage initial
        System.out.println("=== Scores initiaux ===");
        joueur1.afficher();
        joueur2.afficher();
        joueur3.afficher();

        // Mise à jour des scores
        joueur1.ajouterPoints(15);
        joueur2.ajouterPoints(20);
        joueur3.ajouterPoints(5);

        // Affichage après ajout des points
        System.out.println("\n=== Scores après mise à jour ===");
        joueur1.afficher();
        joueur2.afficher();
        joueur3.afficher();
    }
}

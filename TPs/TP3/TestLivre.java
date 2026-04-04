
public class TestLivre {

    public static void main(String[] args) {
        // Création des livres
        Livre livre1 = new Livre("INF101", "Introduction à l’Algorithmique", "Thomas H. Cormen", 120.0);
        Livre livre2 = new Livre("ECO202", "Le Capital au XXIe siècle", "Thomas Piketty", 95.0);
        Livre livre3 = new Livre("ROM303", "Les Misérables", "Victor Hugo", 45.5);

        // Affichage des informations
        livre1.afficher();
        System.out.println("---------------------");

        livre2.afficher();
        System.out.println("---------------------");

        livre3.afficher();
    }
}

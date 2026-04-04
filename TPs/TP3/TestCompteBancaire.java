
public class TestCompteBancaire {

    public static void main(String[] args) {
        // Création d'un tableau de comptes bancaires
        CompteBancaire[] comptes = new CompteBancaire[3];
        comptes[0] = new CompteBancaire("C001", "Ahmed", 1000.0);
        comptes[1] = new CompteBancaire("C002", "Amine", 500.0);
        comptes[2] = new CompteBancaire("C003", "Sirine", 1500.0);

        // Dépôts et retraits
        comptes[0].deposer(200.0);
        comptes[1].retirer(100.0);
        comptes[2].retirer(2000.0); // devrait afficher solde insuffisant

        // Affichage des informations des comptes
        System.out.println("\n=== Informations des comptes ===");
        for (int i = 0; i < comptes.length; i++) {
            comptes[i].afficher();
            System.out.println("----------------------");
        }
    }
}

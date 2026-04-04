
public class CompteBancaire {

    // Attributs
    private String numeroCompte;
    private String proprietaire;
    private double solde;

    // Constructeur
    public CompteBancaire(String nc, String p, double s) {
        numeroCompte = nc;
        proprietaire = p;
        solde = s;
    }

    // Méthode pour déposer de l'argent
    public void deposer(double montant) {
        if (montant > 0) {
            solde += montant;
            System.out.println(montant + " DT déposés sur le compte " + numeroCompte);
        } else {
            System.out.println("Montant invalide pour le dépôt.");
        }
    }

    // Méthode pour retirer de l'argent
    public void retirer(double montant) {
        if (montant > 0) {
            if (montant <= solde) {
                solde -= montant;
                System.out.println(montant + " DT retirés du compte " + numeroCompte);
            } else {
                System.out.println("Solde insuffisant pour le retrait du compte " + numeroCompte);
            }
        } else {
            System.out.println("Montant invalide pour le retrait.");
        }
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Compte : " + numeroCompte);
        System.out.println("Propriétaire : " + proprietaire);
        System.out.println("Solde : " + solde + " DT");
    }
}

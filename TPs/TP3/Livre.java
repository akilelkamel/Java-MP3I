
public class Livre {

    // Attributs

    private String code;
    private String titre;
    private String auteur;
    private double prix;

    // Constructeur
    public Livre(String c, String t, String a, double p) {
        code = c;
        titre = t;
        auteur = a;
        prix = p;
    }

    // Méthode pour afficher les informations d'un livre
    public void afficher() {
        System.out.println("Code   : " + code);
        System.out.println("Titre  : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Prix   : " + prix + " DT");
    }
}

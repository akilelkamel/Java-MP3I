
public class Etudiant {

    // Attributs

    private String matricule;
    private String nom;
    private String prenom;
    private double moyenne;

    // Constructeur
    public Etudiant(String m, String n, String p, double moy) {
        matricule = m;
        nom = n;
        prenom = p;
        moyenne = moy;
    }

    // Getters et Setters
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String m) {
        matricule = m;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String n) {
        nom = n;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String p) {
        prenom = p;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moy) {
        moyenne = moy;
    }

    // Méthode afficher
    public void afficher() {
        System.out.println("Matricule : " + matricule);
        System.out.println("Nom       : " + nom);
        System.out.println("Prénom    : " + prenom);
        System.out.println("Moyenne   : " + moyenne);
    }

    // Méthode admis
    public boolean admis() {
        return moyenne >= 10.0;
    }
}

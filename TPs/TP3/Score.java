
public class Score {

    // Attributs
    private String nom;
    private int score;

    // Constructeur avec nom et score
    public Score(String nom, int score) {
        this.nom = nom;
        this.score = score;
    }

    // Constructeur avec uniquement le nom (score initialisé à 0)
    public Score(String nom) {
        this.nom = nom;
        this.score = 0;
    }

    // Méthode pour afficher le joueur et son score
    public void afficher() {
        System.out.println("Joueur : " + nom + " | Score : " + score);
    }

    // Méthode pour ajouter des points
    public void ajouterPoints(int nbPoints) {
        this.score += nbPoints;
    }
}

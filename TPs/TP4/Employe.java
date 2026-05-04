
public class Employe {

    protected String nom;
    protected String prenom;
    protected double salaireBase;

    public Employe(String nom, String prenom, double salaireBase) {
        this.nom = nom;
        this.prenom = prenom;
        this.salaireBase = salaireBase;
    }

    public double calculerSalaire() {
        return salaireBase;
    }
}

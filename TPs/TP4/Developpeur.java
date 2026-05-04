
public class Developpeur extends Employe {

    private int heuresSup;

    public Developpeur(String nom, String prenom, double salaireBase, int heuresSup) {
        super(nom, prenom, salaireBase);
        this.heuresSup = heuresSup;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + (heuresSup * 10);
    }
}

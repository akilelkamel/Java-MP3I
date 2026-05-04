
public class Manager extends Employe {

    private double prime;

    public Manager(String nom, String prenom, double salaireBase, double prime) {
        super(nom, prenom, salaireBase);
        this.prime = prime;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase + prime;
    }
}

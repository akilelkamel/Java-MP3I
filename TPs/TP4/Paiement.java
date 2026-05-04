
public class Paiement {

    protected double montant;

    public Paiement(double montant) {
        this.montant = montant;
    }

    public void payer() {
        System.out.println("Paiement en cours...");
    }
}

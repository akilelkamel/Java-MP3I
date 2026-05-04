
public class PaiementEspeces extends Paiement {

    public PaiementEspeces(double montant) {
        super(montant);
    }

    @Override
    public void payer() {
        System.out.println("Paiement en espèces: " + montant + " DT");
    }
}

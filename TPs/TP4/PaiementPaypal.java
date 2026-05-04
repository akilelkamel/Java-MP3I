
public class PaiementPaypal extends Paiement {

    private String email;

    public PaiementPaypal(double montant, String email) {
        super(montant);
        this.email = email;
    }

    @Override
    public void payer() {
        System.out.println("Paiement via PayPal: " + montant + " DT");
    }
}

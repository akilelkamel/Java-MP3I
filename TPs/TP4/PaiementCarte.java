
public class PaiementCarte extends Paiement {

    private String numeroCarte;

    public PaiementCarte(double montant, String numeroCarte) {
        super(montant);
        this.numeroCarte = numeroCarte;
    }

    @Override
    public void payer() {
        System.out.println("Paiement par carte: " + montant + " DT");
    }
}

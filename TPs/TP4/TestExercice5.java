
public class TestExercice5 {

    public static void main(String[] args) {
        Paiement[] paiements = new Paiement[3];

        paiements[0] = new PaiementCarte(100, "1234-5678");
        paiements[1] = new PaiementPaypal(200, "test@gmail.com");
        paiements[2] = new PaiementEspeces(50);

        for (int i = 0; i < paiements.length; i++) {
            paiements[i].payer();
        }
    }
}


public class Moto extends Vehicule {

    private int cylindree;

    public Moto(String marque, double vitesse, int cylindree) {
        super(marque, vitesse);
        this.cylindree = cylindree;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Cylindrée: " + cylindree);
    }
}

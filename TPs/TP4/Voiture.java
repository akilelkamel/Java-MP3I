
public class Voiture extends Vehicule {

    private int nbPortes;

    public Voiture(String marque, double vitesse, int nbPortes) {
        super(marque, vitesse);
        this.nbPortes = nbPortes;
    }

    @Override
    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Nombre de portes: " + nbPortes);
    }
}

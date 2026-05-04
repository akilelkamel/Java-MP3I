
public class Vehicule {

    protected String marque;
    protected double vitesse;

    public Vehicule(String marque, double vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }

    public void afficherInfos() {
        System.out.println("Marque: " + marque);
        System.out.println("Vitesse: " + vitesse);
    }
}

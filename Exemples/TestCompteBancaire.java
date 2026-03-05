
public class TestCompteBancaire {

    public static void main(String[] args) {
        CompteBancaire cp1 = new CompteBancaire("Mohamed", 1500);
        CompteBancaire cp2 = new CompteBancaire("Ibrahim", 3200);
        cp2.depot(800);
        cp2.setNom("Brahim");
        System.out.println(cp2.getSolde());
        System.out.println(cp2.getNom());
    }
}

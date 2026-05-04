
public class TestExercice1 {

    public static void main(String[] args) {
        Voiture v = new Voiture("Toyota", 180, 4);
        Moto m = new Moto("Yamaha", 200, 600);

        v.afficherInfos();
        System.out.println("------------------");
        m.afficherInfos();
    }
}

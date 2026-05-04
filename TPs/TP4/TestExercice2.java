
public class TestExercice2 {

    public static void main(String[] args) {
        Employe[] tab = new Employe[2];

        tab[0] = new Manager("Ali", "Ben Mohamed", 2000, 500);
        tab[1] = new Developpeur("Sara", "Ben Salah", 1800, 20);

        for (int i = 0; i < tab.length; i++) {
            System.out.println("Salaire: " + tab[i].calculerSalaire());
        }
    }
}

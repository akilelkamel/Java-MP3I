
import java.util.Scanner;

public class TP2EX2 {

    public static void main(String[] args) {
        int n, n2, s = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Donner un nombre entier positif: ");
        n = sc.nextInt();
        n2 = n;

        while (n > 0) {
            //System.out.println("n = " + n);
            s += n % 10;
            n /= 10; // n = n / 10;
        }
        System.out.println("La somme de chiffres de " + n2 + " est: " + s);
    }
}

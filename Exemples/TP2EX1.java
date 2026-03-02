
import java.util.Scanner;

public class TP2EX1 {

    public static void main(String[] args) {
        int n, s = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Donner un nombre entier positif: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            s += i; // Equivalente a:  s = s + i; 
        }
        System.out.println("La somme de " + n + " premiers nombres est: " + s);
    }
}

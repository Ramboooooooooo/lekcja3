package lekcja3;
import java.util.Scanner;
public class zad1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj dodatnią liczbę całkowitą ");
        int numer = keyboard.nextInt();
        keyboard.nextLine();
        int x = 0;
        for (int i = 1; i <= numer; i++) {
            x = x + i;

        }
        System.out.println(x);
    }
}
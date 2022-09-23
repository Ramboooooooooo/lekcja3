package podstawy;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj numer buta: ");
        int numerButa = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Podaj swoją średnią: ");
        double average = keyboard.nextDouble();
        keyboard.nextLine();

        System.out.println("Podaj imię: ");
        String name = keyboard.nextLine();

        System.out.println("Imię " +name+", Numer buta:" + numerButa+
                " średnia: " + average);

        // zad. 8, 9, 15, 18, 19, 20
    }
}

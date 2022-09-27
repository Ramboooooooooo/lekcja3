package lekcja3;

import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Podaj prędkośc pojazdu ");
        int speed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Podaj liczbę godzin ");
        int hours = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 1; i <= hours; i++) {
            double x=speed*i ;
            System.out.println(" Po godzinie "+i+ "przejechał"+x);

        }

    }
}
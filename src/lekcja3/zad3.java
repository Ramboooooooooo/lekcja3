package lekcja3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args)throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String dane= "plik.txt" ;

        System.out.println("Podaj prędkośc pojazdu ");
        int speed = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Podaj liczbę godzin ");
        int hours = keyboard.nextInt();
        keyboard.nextLine();

        for (int i = 1; i <= hours; i++) {
            double x=speed*i ;
            System.out.println(" Po godzinie "+i+ "przejechał"+x);
            FileWriter fw = new FileWriter( dane,true);

            PrintWriter pw = new PrintWriter(fw);

            pw.println( );


            pw.close();
        }

    }
}


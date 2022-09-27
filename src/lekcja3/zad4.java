package lekcja3;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class zad4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
       System.out.println("Podaj liczbę dni pracy");
    int dni = keyboard.nextInt();
        if(dni<=0){
            System.out.println(" Złe dane");
            System.exit(1);}
        System.out.println(" Złe dane");
        for (int i = 0; i <= dni; i++) {

            System.out.println( "dzień"+i+"wypłata"+Math.pow(2,i)/100);

        }


    }
}

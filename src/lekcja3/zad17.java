package lekcja3;


import java.util.Scanner;

public class zad17 {
    public static void main(String[] args)  {
        Scanner keyboard = new Scanner(System.in);
        double a=Math.random()*100;
        int value = (int)a;
        int speed;
        System.out.println(  value);
        int l=0;
        do {
            l++;
            System.out.println("Podaj liczbę o 1 do 100 ");
            speed = keyboard.nextInt();
            if (speed>value){
                System.out.println( "Za duża");
            }
            else if (speed<value) {
                System.out.println( "Za mała");
            }
        }
      while (speed!=value);
        System.out.println(" Wygrana za "+l+" razem");
}}

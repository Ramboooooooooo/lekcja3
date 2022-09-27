package lekcja3;
import java.io.IOException;
import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj ciąg do przeszkuania");
        String nazwaPliku = scanner.nextLine();
        System.out.println("Podaj szukany ciąg");
        char szukany = scanner.next().charAt(0);
int x=0;
for(int i=0;i<nazwaPliku.length();i++){
    int intIndex = nazwaPliku.indexOf( szukany,i);
    if(nazwaPliku.charAt(i)==szukany){
        x++;
        int d= i+1;
    System.out.println( x+" "+szukany+" na miejscu "+d);}
    }}}
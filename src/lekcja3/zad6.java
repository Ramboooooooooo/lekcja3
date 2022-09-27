package lekcja3;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class zad6 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        File mojPlik = new File ("plik.txt");
        Scanner fileScanner = new Scanner (mojPlik);
        String linia;
        linia = fileScanner.nextLine();
       String data="";
        while (fileScanner.hasNextLine()) {
             data += fileScanner.nextLine();

        }

        System.out.println("Podaj szukany ciąg");
        char szukany = scanner.next().charAt(0);
        int x=0;
        for(int i=0;i<data.length();i++){
            int intIndex = data.indexOf( szukany,i);
            if(data.charAt(i)==szukany){
                x++;
                int d= i+1;
                System.out.println( x+" "+szukany+" na miejscu "+d);}
            fileScanner.close();
        }}

}

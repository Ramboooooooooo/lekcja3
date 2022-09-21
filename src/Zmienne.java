public class Zmienne {
    public static void main(String[] args) {

        int number0;
        number0 = 13;

        double number1 = 13.7;

        double number3;

        number3 = number0;

        int number4;

        number4 = (int)number1;

        System.out.println(number4);


        int workHoursPerYear;
        int days = 4;
        int hours = 8;
        int weeks = 52;

        workHoursPerYear = days * hours * weeks;


        char znak = '#';
        String napis = "Jakiś\n \"tekst\"";

        System.out.println("Ilość\\ godzin pracujących w roku: " +
                workHoursPerYear+" mój napis:" + napis);
        System.out.print("Piękna\n pogoda\n");
        System.out.print("Piękna\t \"pogoda\"" +'a');

        boolean twierdz = true; //false


        //https://github.com/przemjan/trzeciaPgr2
    }
}

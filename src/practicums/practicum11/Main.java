package practicums.practicum11;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Geef naam van de bronbestand: ");
        String bronbestand = myObj.nextLine();
        try {
            Path path = Path.of("src/practicums/practicum11/" + bronbestand + ".txt");
            Files.readString(path); }
        catch (Exception ex){
            System.out.println("geef een bestaand bestands naam"); System.exit(1);}

        System.out.println("Geef naam van het bestemmingsbestand: ");
        String bestemming = myObj.nextLine();
        System.out.println("Geef de waarde van 1 US dollar in Eurocenten: ");

        String waarde = myObj.nextLine();//waarde van 1 us dollar in eurocenten (91.8720 Eurocent)
        try { Double.parseDouble(waarde);}
        catch (NumberFormatException nu){
            System.out.println(nu.getMessage() + " - geef een geldig getal op, geen tekst"); System.exit(1);}

        try {
            //lezen
            Path path = Path.of("src/practicums/practicum11/" + bronbestand + ".txt");
            List<String> alleRegels = Files.readAllLines(path);
            //schrijven
            Path pathOut = Path.of("src/practicums/practicum11/" + bestemming + ".txt");
            BufferedWriter out = Files.newBufferedWriter(pathOut, StandardOpenOption.CREATE, StandardOpenOption.APPEND);

            for (String regel : alleRegels) {
                String[] naamEnDollars = regel.split(" : ");
                String dollars = naamEnDollars[1].strip();
                double dollarsDouble = Double.parseDouble(dollars);
                double euros = (dollarsDouble * (Double.parseDouble(waarde))) / 100;
                out.write(naamEnDollars[0] + " : " + String.format("%.2f", euros) + "\n");
            }
            out.close();
        }
        catch (Exception e) { System.out.println("FOUT: vul de goede waarde in!"); System.exit(1); }
    }
}

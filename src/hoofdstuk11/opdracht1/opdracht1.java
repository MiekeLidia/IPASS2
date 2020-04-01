package hoofdstuk11.opdracht1;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class opdracht1 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src/hoofdstuk11/opdracht1/invoer.txt");
        int aantalGetallen = 0;
        double som = 0;

        List<String> alleRegels = Files.readAllLines(path);
        for (String regel : alleRegels) {
            System.out.println(regel);
            aantalGetallen++;
            double getalDouble = Double.parseDouble(regel);
            som = som + getalDouble;
        }

        System.out.println("" + aantalGetallen);
        System.out.println("" + som/aantalGetallen);


    }
}



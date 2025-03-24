import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fisier {
    public int suma(String fileName) {
        int sum = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                if (scanner.hasNextInt()) {
                    sum += scanner.nextInt();
                } else {
                    scanner.next(); // Ignora valorile care nu sunt numere intregi
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Fisierul nu a fost gasit: " + e.getMessage());
        }
        return sum;
    }
}

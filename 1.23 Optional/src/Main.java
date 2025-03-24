import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double a = null, b = null, c = null;

        try {
            // Citim coeficientii de la tastatura
            System.out.print("Introduceti coeficientul a: ");
            a = Double.parseDouble(scanner.nextLine());

            System.out.print("Introduceti coeficientul b: ");
            b = Double.parseDouble(scanner.nextLine());

            System.out.print("Introduceti coeficientul c: ");
            c = Double.parseDouble(scanner.nextLine());

            // Cream un obiect EcuatieGrad2
            EcuatieGrad2 ecuatie = new EcuatieGrad2(a, b, c);

            // Rezolvam ecuatia
            Double[] solutii = ecuatie.rezolva();

            // Afisam solutiile
            System.out.println("Solutiile sunt:");
            for (Double sol : solutii) {
                System.out.println(sol);
            }

        } catch (NumberFormatException e) {
            System.out.println("Eroare: Trebuie sa introduceti doar numere valide!");
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (FaraRadReale e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Eroare neașteptata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}


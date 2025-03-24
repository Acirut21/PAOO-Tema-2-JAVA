import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer num1 = null, num2 = null;

        try {
            System.out.print("Introduceti primul numar: ");
            String input1 = scanner.nextLine();
            if (!input1.isEmpty()) {
                num1 = Integer.parseInt(input1);
            }

            System.out.print("Introduceti al doilea numar: ");
            String input2 = scanner.nextLine();
            if (!input2.isEmpty()) {
                num2 = Integer.parseInt(input2);
            }

            // Verificam daca vreun numar este null
            if (num1 == null || num2 == null) {
                throw new NullPointerException("Unul dintre numere este null!");
            }

            int suma = num1 + num2;
            System.out.println("Suma: " + suma);

        } catch (NumberFormatException e) {
            System.out.println("Eroare: Trebuie sa introduceti doar numere valide!");
        } catch (NullPointerException e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Eroare neașteptata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

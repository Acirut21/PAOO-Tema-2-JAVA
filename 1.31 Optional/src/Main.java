import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nAlege o optiune:");
            System.out.println("1. Genereaza și scrie 3 numere aleatoare în fisiere diferite (Thread)");
            System.out.println("2. Genereaza și scrie un numar variabil de numere aleatoare (ExecutorService)");
            System.out.println("3. Ieșire");
            System.out.print("Optiunea ta: ");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consuma newline

            switch (option) {
                case 1:
                    Thread t1 = new Thread(new RandomNumberWriter("file1.txt"));
                    Thread t2 = new Thread(new RandomNumberWriter("file2.txt"));
                    Thread t3 = new Thread(new RandomNumberWriter("file3.txt"));

                    t1.start();
                    t2.start();
                    t3.start();
                    try {
                        t1.join();
                        t2.join();
                        t3.join();
                    } catch (InterruptedException e) {
                        System.out.println("Thread intrerupt: " + e.getMessage());
                    }
                    System.out.println("Generarea numerelor s-a terminat.");
                    break;

                case 2:
                    System.out.print("Introduceti numarul de fisiere: ");
                    int n = scanner.nextInt();
                    scanner.nextLine(); // Consuma newline

                    ExecutorService executor = Executors.newFixedThreadPool(n);
                    for (int i = 1; i <= n; i++) {
                        executor.execute(new RandomNumberWriter("file" + i + ".txt"));
                    }
                    executor.shutdown();
                    System.out.println("Generarea numerelor s-a terminat.");
                    break;

                case 3:
                    System.out.println("La revedere!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Optiune invalida, încearca din nou.");
            }
        }
    }
}
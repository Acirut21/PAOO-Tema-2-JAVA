import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class RandomNumberWriter implements Runnable {
    private final String fileName;

    public RandomNumberWriter(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Random rand = new Random();
        int number = rand.nextInt(100);
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(String.valueOf(number));
            System.out.println("Scris în " + fileName + ": " + number);
        } catch (IOException e) {
            System.out.println("Eroare la scrierea în " + fileName + ": " + e.getMessage());
        }
    }
}
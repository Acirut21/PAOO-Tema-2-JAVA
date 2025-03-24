public class Main {
    public static void main(String[] args) {
        Fisier processor = new Fisier();
        String fileName = "input.txt"; // Asigura-te că ai un fisier cu acest nume
        int sum = processor.suma(fileName);
        System.out.println("Suma numerelor intregi din fisier: " + sum);
    }
}
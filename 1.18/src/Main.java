import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Cream si populam lista de numere intregi
        List<Integer> numbers = Arrays.asList(42, 15, 8, 23, 4, 16, 99, 7);

        // Sortam lista folosind Collections.sort()
        Collections.sort(numbers);

        // Afisam lista sortata
        System.out.println("Lista sortata: " + numbers);
    }
}
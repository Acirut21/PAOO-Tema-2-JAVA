import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> numere = Arrays.asList(1, 2, 3, 4, 5, 6);

        // Păstrează doar numerele pare
        List<Integer> numerePare = numere.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(numerePare); // [2, 4, 6]
    }
}

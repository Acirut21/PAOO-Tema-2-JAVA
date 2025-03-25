import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nume = Arrays.asList("Maria", "Ion", "Ana", "Bogdan");

        // Sortare alfabetică (crescătoare)
        List<String> numeSortate = nume.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(numeSortate); // [Ana, Bogdan, Ion, Maria]

        // Sortare descrescătoare
        List<String> numeDescrescator = nume.stream()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println(numeDescrescator); // [Maria, Ion, Bogdan, Ana]
    }
}

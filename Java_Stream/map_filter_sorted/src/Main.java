import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nume = Arrays.asList("ana", "maria", "ion", "alex");

        List<String> rezultat = nume.stream()
                .filter(n -> n.length() > 3) // Păstrează numele mai lungi de 3 litere
                .map(String::toUpperCase)    // Transformă în majuscule
                .sorted()                    // Sortează alfabetic
                .collect(Collectors.toList());

        System.out.println(rezultat); // [ALEX, MARIA]
    }
}

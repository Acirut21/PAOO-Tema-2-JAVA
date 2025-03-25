import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nume = Arrays.asList("ana", "maria", "ion");

        // Transformă fiecare nume cu prima literă mare
        List<String> numeCapitalizate = nume.stream()
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .collect(Collectors.toList());

        System.out.println(numeCapitalizate); // [Ana, Maria, Ion]
    }
}

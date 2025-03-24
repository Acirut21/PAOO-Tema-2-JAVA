import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Cream lista de studenti
        List<Student> studenti = Arrays.asList(
                new Student("Ana", 9),
                new Student("Mihai", 7),
                new Student("Ioana", 10),
                new Student("Andrei", 8)
        );

        // Sortam lista dupa nota folosind Comparator
        studenti.sort(Comparator.comparingInt(Student::getNota));

        // Afisam lista sortata
        System.out.println("Lista sortata după nota:");
        for (Student s : studenti) {
            System.out.println(s);
        }
    }
}

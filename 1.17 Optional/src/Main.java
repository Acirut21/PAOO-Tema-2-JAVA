public class Main {
    public static void main(String[] args) {
        try {
            Ecuatie_Grad_2 eq = new Ecuatie_Grad_2(1.0, -3.0, 2.0); // x^2 - 3x + 2 = 0
            Double[] solutions = eq.solve();

            if (solutions != null) {
                System.out.println("Solutiile sunt:");
                for (Double sol : solutions) {
                    System.out.println(sol);
                }
            } else {
                System.out.println("Nu exista solutii.");
            }
        } catch (FaraRadReale e) {
            System.out.println("Eroare: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Eroare neașteptata: " + e.getMessage());
        }
    }
}

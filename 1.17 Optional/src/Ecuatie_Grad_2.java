class FaraRadReale extends Exception {
    public FaraRadReale(String message) {
        super(message);
    }
}

public class Ecuatie_Grad_2 {
    private Double a, b, c;

    public Ecuatie_Grad_2(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double[] solve() throws FaraRadReale {
        if (a == null || b == null || c == null) {
            throw new IllegalArgumentException("Coeficientii nu pot fi null!");
        }

        if (a == 0) {
            if (b == 0) {
                throw new IllegalArgumentException("Ecuatia nu este valida.");
            }
            return new Double[]{-c / b};  // Ecuatie de gradul I
        }

        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            return new Double[]{x1, x2};
        } else if (delta == 0) {
            double x = -b / (2 * a);
            return new Double[]{x};
        } else {
            throw new FaraRadReale("Nu exista solutii reale.");
        }
    }
}

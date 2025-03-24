public class EcuatieGrad2 {
    private double a, b, c;

    public EcuatieGrad2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double[] rezolva() throws FaraRadReale {
        if (a == 0) {
            throw new IllegalArgumentException("Coeficientul a nu poate fi 0 pentru ecuatia de gradul 2.");
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
class Student {
    private String nume;
    private int nota;

    public Student(String nume, int nota) {
        this.nume = nume;
        this.nota = nota;
    }

    public String getNume() {
        return nume;
    }

    public int getNota() {
        return nota;
    }

    @Override
    public String toString() {
        return nume + " - Nota: " + nota;
    }
}
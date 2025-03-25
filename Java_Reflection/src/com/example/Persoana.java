package com.example;

public class Persoana {
    private String nume;
    private int varsta;

    public Persoana() {
        this.nume = "Necunoscut";
        this.varsta = 0;
    }

    public Persoana(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    public void spuneSalut() {
        System.out.println("Salut! Numele meu este " + nume);
    }

    private void mesajSecret() {
        System.out.println("Acesta este un mesaj privat.");
    }
}
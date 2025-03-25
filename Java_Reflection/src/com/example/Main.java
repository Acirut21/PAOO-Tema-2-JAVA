package com.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtine clasa
            Class<?> clazz = Class.forName("com.example.Persoana");

            // Afișeaza numele clasei
            System.out.println("Clasa: " + clazz.getName());

            // Obtine și afișeaza constructorii
            System.out.println("\n--- Constructori ---");
            Constructor<?>[] constructori = clazz.getConstructors();
            for (Constructor<?> constructor : constructori) {
                System.out.println(constructor);
            }

            // Obtine și afișeaza metodele publice
            System.out.println("\n--- Metode publice ---");
            Method[] metode = clazz.getMethods();
            for (Method metoda : metode) {
                System.out.println(metoda);
            }

            // Obtine și afișeaza toate metodele (inclusiv private)
            System.out.println("\n--- Toate metodele (inclusiv private) ---");
            Method[] allMetode = clazz.getDeclaredMethods();
            for (Method metoda : allMetode) {
                System.out.println(metoda);
            }

            // Obtine și afișeaza câmpurile clasei
            System.out.println("\n--- Campurile clasei ---");
            Field[] campuri = clazz.getDeclaredFields();
            for (Field camp : campuri) {
                System.out.println(camp);
            }

            // Creeaza o instanta a clasei folosind Reflection
            Object obj = clazz.getConstructor(String.class, int.class).newInstance("Alex", 25);

            // Apeleaza metoda publica `spuneSalut`
            Method spuneSalut = clazz.getMethod("spuneSalut");
            spuneSalut.invoke(obj);

            // Acceseaza și modifica un câmp privat
            Field numeField = clazz.getDeclaredField("nume");
            numeField.setAccessible(true);
            numeField.set(obj, "Andrei");

            // Reapelam metoda pentru a vedea modificarea
            spuneSalut.invoke(obj);

            // Acceseaza și apeleaza metoda privata `mesajSecret`
            Method metodaPrivata = clazz.getDeclaredMethod("mesajSecret");
            metodaPrivata.setAccessible(true);
            metodaPrivata.invoke(obj);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package be.storm.basicClass;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        exampleclass p = new exampleclass("Goo", "Resh");
        exampleclass p2 = new exampleclass("Czlt", "Gui");
        exampleclass p3 = new exampleclass("Jo", "Taxi", LocalDate.of(1991, 6, 15));

        p.setName("Goo");
        p.getNom();

        p.afficher();
        p2.afficher();

    }
}

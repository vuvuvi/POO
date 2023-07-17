package be.storm.heritage;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Vehicule v = new Vehicule();
        v.seDeplacer();

        Voiture voiture = new Voiture();
        voiture.setMarque("Toyota");
        voiture.setModele("1562");

        Bateau bateau = new Bateau();
        bateau.setMarque("Gazelle");
        bateau.setModele("K254");

        Avion avion = new Avion();
        avion.setMarque("Boeing");
        avion.setModele("A782");

        Vehicule z = new Bateau();

        ArrayList<Vehicule> vehicules = new ArrayList<>();
        vehicules.add(new Voiture());
        vehicules.add(new Bateau());
        vehicules.add(new Avion());

        System.out.println("------------------------------------------------");

        for(Vehicule y : vehicules) {
            y.seDeplacer();
        }

        System.out.println(bateau.toString());


    }
}

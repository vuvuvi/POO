package be.storm.animalerie;

import java.time.LocalDate;

public class Rat extends Animaux{
    public Rat(String name, Double poids, Double taille, boolean sexe, Integer age, LocalDate arrivee) {
        super(name, poids, taille, sexe, age, arrivee);
   }
}

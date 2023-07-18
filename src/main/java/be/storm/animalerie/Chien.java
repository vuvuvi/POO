package be.storm.animalerie;

import java.time.LocalDate;

public class Chien extends Animaux{

    public String couleurcollar;

    public boolean dresse;

    public String race;

    public double deathrate = 1.0;

    public Chien(String name, Double poids, Double taille, boolean sexe, Integer age, LocalDate arrivee) {
       super(name, poids, taille, sexe, age, arrivee);

    }
//region Getter & Setter
    public String getCouleurcollar() {
        return couleurcollar;
    }

    public void setCouleurcollar(String couleurcollar) {
        this.couleurcollar = couleurcollar;
    }

    public boolean isDresse() {
        return dresse;
    }

    public void setDresse(boolean dresse) {
        this.dresse = dresse;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public double getDeathrate() {
        return deathrate;
    }
//endregion


}

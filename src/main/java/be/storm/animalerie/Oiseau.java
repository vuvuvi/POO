package be.storm.animalerie;

import java.time.LocalDate;

public class Oiseau extends Animaux {

    public String couleur;

    public boolean cage;

    public double deathrate = 3.0;

    public Oiseau(String name, Double poids, Double taille, boolean sexe, Integer age, LocalDate arrivee) {
        super(name, poids, taille, sexe, age, arrivee);
    }
//region Getter & Setter
    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public boolean isCage() {
        return cage;
    }

    public void setCage(boolean cage) {
        this.cage = cage;
    }

    public double getDeathrate() {
        return deathrate;
    }
//endregion


}

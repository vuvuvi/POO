package be.storm.animalerie;

public class Oiseau extends Animaux {

    public String couleur;

    public boolean cage;

    public double deathrate = 3.0;

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


}

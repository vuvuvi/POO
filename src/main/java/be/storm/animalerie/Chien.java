package be.storm.animalerie;

public class Chien extends  Animaux{

    public String couleurcollar;

    public boolean dresse;

    public String race;

    public double deathrate = 1.0;

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


}

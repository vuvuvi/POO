package be.storm.animalerie;

import java.time.LocalDate;

public class Chat extends  Animaux{

    public String comportement;

    public boolean griffe;

    public boolean poilsLongs;

    public Double deathrate = 0.5;

    public Chat(String name, Double poids, Double taille, boolean sexe, Integer age, LocalDate arrivee) {
       super(name, poids, taille, sexe, age, arrivee);
    }
//region Getter & Setter
    public String getComportement() {
        return comportement;
    }

    public void setComportement(String comportement) {
        this.comportement = comportement;
    }

    public boolean isGriffe() {
        return griffe;
    }

    public void setGriffe(boolean griffe) {
        this.griffe = griffe;
    }

    public boolean isPoilsLongs() {
        return poilsLongs;
    }

    public void setPoilsLongs(boolean poilsLongs) {
        this.poilsLongs = poilsLongs;
    }

    public Double getDeathrate() {
        return deathrate;
    }
//endregion


}

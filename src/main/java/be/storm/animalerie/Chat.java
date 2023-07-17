package be.storm.animalerie;

public class Chat extends  Animaux{

    public String comportement;

    public boolean griffe;

    public boolean poilsLongs;

    public Double deathrate = 0.5;

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


}

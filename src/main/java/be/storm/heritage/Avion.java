package be.storm.heritage;

public class Avion extends Vehicule {

    private int nbMoteurs;

    public int getNbMoteurs() {
        return nbMoteurs;
    }

    public void setNbMoteurs(int nbMoteurs) {
        this.nbMoteurs = nbMoteurs;
    }

    @Override

    public void seDeplacer() {
        System.out.println("Je vooooole, ");
    }
}

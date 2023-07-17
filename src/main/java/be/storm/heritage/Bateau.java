package be.storm.heritage;

public class Bateau extends Vehicule {

    private int nbVoiles;

    public int getNbVoiles() {
        return nbVoiles;
    }

    public void setNbVoiles(int nbVoiles) {
        this.nbVoiles = nbVoiles;
    }

    @Override

    public void seDeplacer() {
        System.out.println("Je flotte, ");
    }
}

package be.storm.constructeursRecap.models;

public class Vache extends Herbivore{

    //region Attributs

    private boolean estTachetee;

    //endregion

    //region Constructeur

    public Vache(String name, int weight, int size, String paramRegion, boolean estTachetee) {
        super(name, weight, size, paramRegion);
        this.estTachetee = estTachetee;
    }


    //endregion

    //region Propriétés

    public boolean isEstTachetee() {
        return estTachetee;
    }

    public void setEstTachetee(boolean estTachetee) {
        this.estTachetee = estTachetee;
    }


    //endregion

    //region Methodes

    @Override
    public void crier() {
        System.out.println("Meuuuuuuuuuuuuuuuuuuuuuuuuuuh");
    }


    //endregion
}

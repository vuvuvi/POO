package be.storm.heritage;

public class Vehicule {
    private String modele;
    private String marque;

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void seDeplacer() {
        System.out.println("Yiiiiha!");
    }

    public String toString() {
        return "Marque : " + marque + "\n" +
                "Modèle : " + modele;
    }

}

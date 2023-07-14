package be.storm.voiture;

public class Voitures {
    private String modele;
    private int min,max,vitesse;

    public Voitures(String modele, int min, int max) {
        this.modele = modele;
        this.min = min;
        this.max = max;

    }

    public String getModele(){return this.modele;}
    public void setModele(String modele){
        this.modele = modele;
    }

    public int getMin(){return this.min;}
    public void setMin(int min) {this.min = min;}

    public int getMax(){return this.max;}
    public void setMax(int max) {this.max = max;}


    public int vitesse() {
        vitesse = (int) ((Math.random() * (max - min)) + min);
        System.out.println(vitesse);

        return vitesse;
    }


}

package be.storm.voiture;

public class Circuit {
    private int tour;
    private int km;
    public Circuit(int tour, int km) {
        this.tour = tour;
        this.km = km;
    }

    public int getTour() {return this.tour;}
    public void setTour(int tour) {
        this.tour = tour;
    }

    public int getKm() {return this.km;}
    public void setKm(int km) { this.km = km;}

    public void init() {
        System.out.println("Il y a " + tour + " tours de " + km + " km.");
    }

    public int course() {
        int total = this.tour * this.km;
        return total;

    }

}

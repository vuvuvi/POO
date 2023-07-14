package be.storm.voiture;

public class Main {
    public static void main(String[] args) {

        Circuit circuit = new Circuit(8, 100);
        Voitures a = new Voitures("Twingo", 80,120);
        Voitures b = new Voitures("Toyota",90,150);
        Voitures c = new Voitures ("Audi", 100,200);

        circuit.init();
        int va = a.vitesse();
        int vb = b.vitesse();
        int vc = c.vitesse();

        int course = circuit.course();

        // distance / vitesse

        double totala = course/va;
        System.out.println(totala);
        double totalb = course/vb;
        System.out.println(totalb);
        double totalc = course/vc;
        System.out.println(totalc);

        if (totala< totalb && totala < totalc) {
            System.out.println("Twingo a gagné");

        }
        if (totalb< totala && totalb < totalc) {
            System.out.println("Toyota a gagné");

        }
        if (totalc< totalb && totalc < totala) {
            System.out.println("Audi a gagné");

        }

    }
}

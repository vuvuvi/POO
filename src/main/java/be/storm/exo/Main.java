package be.storm.exo;

public class Main {
    public static void main(String[] args) {
        exampleclass p = new exampleclass("Resh","Goo");
        Courant pc = new Courant(p, "Be 65 23 45 871", 457.12, -100);


        System.out.println(pc.getLigneDeCredit());

        pc.depot();
        pc.retrait();
    }
}

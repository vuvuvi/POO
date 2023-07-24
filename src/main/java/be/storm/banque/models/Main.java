package be.storm.banque.models;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Banque banque = new Banque("Les voleurs");
        Personne p1 = new Personne("Schwarzy", "Arnold", LocalDate.of(1960, 5, 21));


        Courant c1 = new Courant(p1, "1", 4542485);


        c1.depot(1000);

        Personne p2 = new Personne("Stalone", "Sylvester", LocalDate.of(1960, 5, 21));


        Epargne c2 = new Epargne("2", p2);


        banque.ajouterCompte(c1);
        banque.ajouterCompte(c2);

        try {

            c2.depot(1500);
            banque.recupCompte("2").retrait(500);
            banque.recupCompte("1").retrait(250);
        }catch (SoldeInsuffisant ex) {
            System.out.println(ex.getMessage());
        }catch (IllegalArgumentException ex ){
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


        System.out.println(banque.recupCompte("1").getTitulaire().getPrenom());

        System.out.println(c1.getTitulaire().getPrenom() + " : " + c1.getSolde() + " euro.");
        c1.depot(1000);
        System.out.println(c1.getTitulaire().getPrenom() + " : " + c1.getSolde() + " euro.");
        c1.retrait(500);
        System.out.println(c1.getTitulaire().getPrenom() + " : " + c1.getSolde() + " euro.");

        System.out.println(c1.getTitulaire().getDdn().getYear());
    }
}
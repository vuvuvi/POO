package be.storm.banque;

import java.time.LocalDate;
import java.util.Scanner;

public class Courant {

    Scanner scan = new Scanner(System.in);
    private Personne titulaire = new Personne("Resh", "Goo", LocalDate.of(1992, 07, 27));
    private String numero;
    private double solde;
    private double ligneDeCredit;

    public Courant(Personne titulaire, String numero) {
        this.titulaire = titulaire;
        this.numero = numero;
    }

    public Courant(Personne titulaire, String numero, double solde, double ligneDeCredit) {
        this.titulaire = titulaire;
        this.numero = numero;
        this.solde = solde;
        this.ligneDeCredit = ligneDeCredit;
    }

    public String getNuméro() {
        return this.numero;
    }

    public void setNumero(String numero) {
        if (numero.trim().equals("")) {
            return;
        }
        this.numero = numero;
    }

    public double getSolde() {
        return this.solde;
    }

    public double getLigneDeCredit() {
        return this.ligneDeCredit;
    }

    public void setLigneDeCredit(double ligneDeCredit) {

        this.ligneDeCredit = ligneDeCredit;
    }

    public Personne getTitulaire() {
        return this.titulaire;
    }

    public void setTitulaire(Personne titulaire) {

        this.titulaire = titulaire;
    }
//normalement input externe à tout ça, le mettre dans main et faire retrait(double montant){}

    public void retrait() {
        System.out.println("Combien souhaitez-vous retirer ?");
        double montant = scan.nextDouble();
        double temp = solde;
        solde -= montant;
        if (solde < ligneDeCredit)  {
            System.out.println("Vous avez dépassé le débit autorisé");
            solde = temp;
        }
        System.out.println("Votre solde est de : " + this.solde);

    }

    public void  depot() {
        System.out.println("Combien soughaitez-vous déposer ?");
        double montant = scan.nextDouble();

        solde += montant;

        System.out.println("Votre solde est de : " + this.solde);
    }

}

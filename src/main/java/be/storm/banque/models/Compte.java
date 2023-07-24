package be.storm.banque.models;

public abstract class Compte {


    private String numero;
    private double solde;
    private Personne titulaire;
    private double interet;

    public String getNumero() {
        return numero;
    }

 /*   public void setNumero(String numero) {
        this.numero = numero;
    }*/

    public double getInteret() {
        return interet;
    }

    public double getSolde() {
        return solde;
    }

    public Personne getTitulaire() {
        return titulaire;
    }

/*    public void setTitulaire(Personne titulaire) {
        this.titulaire = titulaire;
    }*/

    public Compte(String numero, Personne titulaire) {
        this.numero = numero;
        this.titulaire = titulaire;
    }

    public Compte (String numero, Personne titulaire, double solde) {
        this.numero = numero;
        this.titulaire = titulaire;
        this.solde = solde;
    }
    public void retrait(double montant){


        retrait(montant,0);
    }

    public void retrait(double montant, double ligneDeCredit)  {

        if(montant < 0){
            throw new OutofRange();
        }
        if(getSolde() - montant < - ligneDeCredit){
            throw new SoldeInsuffisant("Vous avez dépassé la limite de crédit autorisée");
        }
        solde -= montant;
    }

    public void depot(double montant)  {
        if(montant < 0){
            throw new OutofRange();
        }
        solde += montant;
    }

    protected  void calculInteret(double r){
        this.interet = interet;


    }
    public void appliquerInteret() {

    }

}





























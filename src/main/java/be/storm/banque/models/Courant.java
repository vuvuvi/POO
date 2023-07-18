package be.storm.banque.models;

public class Courant extends Compte{
    private double ligneDeCredit;

    public Courant( Personne titulaire,String numero, double solde) {
        super(numero, titulaire, solde);

    }
    public Courant(String numero, Personne titulaire, double ligneDeCredit) {
        //super(numero, titulaire);
        super(numero, titulaire);
        this.ligneDeCredit = ligneDeCredit;
    }

    public double getLigneDeCredit() {
        return ligneDeCredit;
    }

    private void setLigneDeCredit(double ligneDeCredit) {
        if(ligneDeCredit < 0){
            return;
        }
        this.ligneDeCredit = ligneDeCredit;
    }

    @Override
    public void retrait(double montant) {
        super.retrait(montant,getLigneDeCredit());
    }

    @Override

    protected void calculInteret(double interet) {

        if (this.getSolde() > 0) {
            interet = 3;

        }
        else { interet = 9.7;}
    }
}
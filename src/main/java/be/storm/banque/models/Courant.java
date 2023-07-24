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

    private void setLigneDeCredit(double ligneDeCredit)  throws LignedecreditException {
        if(ligneDeCredit < 0){
            throw new LignedecreditException();
        }
        this.ligneDeCredit = ligneDeCredit;
    }

    @Override
    public void retrait(double montant) {
        super.retrait(montant,getLigneDeCredit());
    }



    protected double calculInteret() {
        if(getSolde() < 0){
            return getSolde() * 0.0975;
        }
        return getSolde() * 0.03;
//        return getSolde() < 0 ? getSolde() * 0.0975 : getSolde() * 0.03;
    }

    @Override

    public void appliquerInteret(){

    }
}
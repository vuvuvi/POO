package be.storm.banque.models;
import be.storm.banque.models.SoldeInsuffisant;
import be.storm.banque.models.OutofRange;
public class Courant extends Compte{
    private double ligneDeCredit;

    public Courant( Personne titulaire,String numero) {
        super(numero, titulaire);

    }
    public Courant(String numero, Personne titulaire, double ligneDeCredit) throws OutofRange {
        //super(numero, titulaire);
        super(numero, titulaire);
       setLigneDeCredit(ligneDeCredit);
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
    public void retrait(double montant) throws SoldeInsuffisant {
        super.retrait(montant,getLigneDeCredit());
    }



    protected double calculInteret() {
        if(getSolde() < 0){
            return getSolde() * 0.0975;
        }
        return getSolde() * 0.03;
//        return getSolde() < 0 ? getSolde() * 0.0975 : getSolde() * 0.03;
    }

    public void traiter(Compte c) {
        if (this.getSolde() < 0) {
            traiter(c);
        }
    }



}
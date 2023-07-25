package be.storm.banque.models;

import java.time.LocalDateTime;
import be.storm.banque.models.SoldeInsuffisant;

public class Epargne extends Compte{

    private LocalDateTime dateDernierRetrait;

    public Epargne(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    public Epargne(String numero, Personne titulaire, double solde) {
        super(numero, titulaire, solde);
    }

    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    public void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

    @Override
    public void retrait(double montant) throws SoldeInsuffisant {
        double previous = getSolde();
        super.retrait(montant);
        if(previous > getSolde()){
            this.dateDernierRetrait = LocalDateTime.now();
        }
    }

    @Override
    protected double calculInteret() {
        return getSolde() * 0.045;
    }
}

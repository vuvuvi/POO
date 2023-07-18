package be.storm.banque.models;

import java.time.LocalDateTime;

public class Epargne extends Compte{

    private LocalDateTime dateDernierRetrait;

    public Epargne(String numero, Personne titulaire) {
        super(numero, titulaire);
    }

    public LocalDateTime getDateDernierRetrait() {
        return dateDernierRetrait;
    }

    public void setDateDernierRetrait(LocalDateTime dateDernierRetrait) {
        this.dateDernierRetrait = dateDernierRetrait;
    }

    @Override
    public void retrait(double montant) {
        double previous = getSolde();
        super.retrait(montant);
        if(previous > getSolde()){
            setDateDernierRetrait(LocalDateTime.now());
        }
    }

    @Override

    protected void calculInteret(double interet) {
       interet = 4.5;
    }
}

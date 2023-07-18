package be.storm.banque.models;

import java.time.LocalDate;

public class Personne {

    private String nom;
    private String prenom;
    private LocalDate ddn;

    public Personne (String nom, String prenom, LocalDate ddn){
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
    }
    public String getNom() {
        return nom;
    }

  /*  public void setNom(String nom) {
        this.nom = nom;
    }*/

    public String getPrenom() {
        return prenom;
    }

/*    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }*/

    public LocalDate getDdn() {
        return ddn;
    }

/*    public void setDdn(LocalDate ddn) {
        this.ddn = ddn;
    }*/
}

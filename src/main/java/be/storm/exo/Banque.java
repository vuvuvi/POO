package be.storm.exo;

import be.storm.banque.Courant;

import java.util.HashMap;

public class Banque {

    private String nom;
    private HashMap<String, be.storm.banque.Courant> comptes = new HashMap<>();

    public Banque(String nom)  {
        comptes = new HashMap<>();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HashMap<String, be.storm.banque.Courant> getComptes() {
        return (HashMap<String, be.storm.banque.Courant>)  comptes.clone();
    }

    public void ajouterCompte(be.storm.banque.Courant c) {
        if (comptes.containsKey(c.getNuméro())) {return;}
        comptes.put(c.getNuméro(), c);
    }

    public void supprimerComptes(String numero) {
        comptes.remove(numero);
    }

    public Courant recupCompte(String numero) {
        return comptes.get(numero);
    }
}

package be.storm.banque;

import java.util.HashMap;

public class Banque {

    private String nom;
    private HashMap<String, Courant> comptes = new HashMap<>();

    public Banque (String nom)  {
        comptes = new HashMap<>();
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public HashMap<String, Courant> getComptes() {
        return (HashMap<String, Courant>)  comptes.clone();
    }

    public void ajouterCompte(Courant c) {
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

package be.storm.banque.models;

public interface Banker extends  Customer{

    void appliquerInteret();

    Personne getTitulaire();

    String getNumero();


}

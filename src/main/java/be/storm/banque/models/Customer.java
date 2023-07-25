package be.storm.banque.models;
import be.storm.banque.models.*;
public interface Customer {

    double getSolde();

    void retrait(double montant) throws SoldeInsuffisant;

    void depot(double montant);


}

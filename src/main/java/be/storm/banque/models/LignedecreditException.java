package be.storm.banque.models;

public class LignedecreditException extends IllegalStateException{

    public LignedecreditException() {
        super ("Valeur erronée");
    }

    public LignedecreditException(String s) {
        super(s);
    }
}

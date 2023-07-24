package be.storm.banque.models;

public class SoldeInsuffisant extends IllegalStateException {
    public SoldeInsuffisant() {
        super("Solde insuffisant");
    }

    public SoldeInsuffisant(String s) {
        super(s);
    }
}

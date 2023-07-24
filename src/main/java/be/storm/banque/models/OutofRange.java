package be.storm.banque.models;

public class OutofRange extends IllegalArgumentException {

    public OutofRange() {
        super("le montant doit être supérieur à zéro");
    }

    public OutofRange(String s) {
        super(s);
    }
}

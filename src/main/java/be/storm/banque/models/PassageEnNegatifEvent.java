package be.storm.banque.models;

import java.util.ArrayList;
import java.util.List;

public class PassageEnNegatifEvent{

    private List<PassageEnNegatifDelegate> negatif;

    public PassageEnNegatifEvent() {
        this.negatif = new ArrayList<>();
    }

    public void addNegatif(PassageEnNegatifDelegate negatifc) {
        negatif.add(negatifc);
    }

    private void event(Compte c) {
        System.out.println( c.getTitulaire() + " est en negatif");
    }

    public void traiter(Compte c) {
        for (PassageEnNegatifDelegate p : negatif) {
            p.execute(c);
        }
    }


}

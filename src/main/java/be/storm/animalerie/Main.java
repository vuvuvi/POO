package be.storm.animalerie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        ArrayList chat = new ArrayList<Chat>();
        ArrayList chien = new ArrayList<Chien>();
        ArrayList oiseau = new ArrayList<Oiseau>();

      ArrayList animaux = new ArrayList<Animaux>();


        //region avant constructeurs

        /*Chien c1 = new Chien();
        Chien c2 = new Chien();
        Chien c3 = new Chien();
        Chien c4 = new Chien();


        Chat ch1 = new Chat();
        Chat ch2 = new Chat();
        Chat ch3 = new Chat();
        Chat ch4 = new Chat();

        Oiseau o1 = new Oiseau();
        Oiseau o2 = new Oiseau();
        Oiseau o3 = new Oiseau();
        Oiseau o4 = new Oiseau();

        c1.setAge(2);
        c2.setAge(15);
        c3.setAge(6);
        c4.setAge(9);
        c1.setName("Bethoven");
        c2.setName("Didier");
        c3.setName("Pogo");
        c4.setName("Rita");
        c1.setPoids(4.5);
        c2.setPoids(10.20);
        c3.setPoids(6.8);
        c4.setPoids(9.7);

        ch1.setAge(7);
        ch2.setAge(1);
        ch3.setAge(3);
        ch4.setAge(10);
        ch1.setName("Poulycrock");
        ch2.setName("Bicky");
        ch3.setName("Sully");
        ch4.setName("Pixelle");
        ch1.setPoids(5.0);
        ch2.setPoids(2.5);
        ch3.setPoids(3.7);
        ch4.setPoids(8.5);

        o1.setAge(1);
        o2.setAge(2);
        o3.setAge(3);
        o4.setAge(4);
        o1.setName("Titi");
        o2.setName("Piu Piu");
        o3.setName("Oui Oui");
        o4.setName("Non Non");
        o1.setPoids(0.3);
        o2.setPoids(1.0);
        o3.setPoids(0.6);
        o4.setPoids(1.2);
*/

        //endregion

animaux.add(new Chat("Pouly",2.5,0.20,true,3, LocalDate.of(2018,06,25)));
    }
}

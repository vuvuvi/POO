package be.storm.demoStatic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Des {

    public static int lancerDeDes(int nb, int face, int choix) {
        int s = 0;
        //int[] tab = new int[nb];
        Random rn = new Random();
        ArrayList<Integer> tab = new ArrayList<>();

        for (int i = 0; i < nb; i++) {

            tab.add(rn.nextInt(face) + 1);

            System.out.print(tab.get(i) + "| ");
        }

     tab.sort(Comparator.reverseOrder());


        System.out.println(" ");

        for (int i = 0; i < nb; i++) {

            System.out.print(tab.get(i) + "| ");
        }
        System.out.println(" ");

        if (choix > nb ||choix <= 0) {
            new RuntimeException("Error");
            return 0;
        }

        for (int i = 0; i < choix; i++) {
            s += tab.get(i);;
        }

        System.out.println("Le résultat est " +s);
        return s;

    }
}

package be.storm.interfacesFonctionnelles;

import be.storm.demoStatic.Movie;

import static be.storm.demoStatic.MoneyConverter.Converter.*;
import static be.storm.demoStatic.Movie.*;

public class Main {

    public static void main(String[] args) {

        double euro = 42;
        System.out.println(euro + "€");
        double dollar = EuroToDollar(euro);
        euro = DollarToEuro(dollar);

        System.out.println(dollar + "$");
        System.out.println(euro + "€");

//        for(double i = 0.0; i < 10.0; i+= 0.01){
//            System.out.println(i);
//        }

        Movie m1 = new Movie("Gladiator");
        Movie m2 = new Movie("Braveheart");
        Movie m3 = new Movie("Oppenheimer");


        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);

        System.out.println(Movie.currentId);

        Command c2 = new Command() {
            @Override
            public void execute() {
                System.out.println("Uhhhh");

            }
        };
        Command c3 = new CommandimpExpl();
        c3.execute();


        //instancier et overrider en une fois
        Command c4 = () -> System.out.println("lambda");

        //changer une variable déjà instanciée

        c3 = () -> System.out.println("yolelelelo");
        c2.execute();
        c3.execute();
        c4.execute();



    }
}
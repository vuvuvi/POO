package be.storm.animalerie;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public abstract class Animaux {

    //region Attributs
    private String name;
    private Double poids;
    private Double taille;

    private boolean sexe;

    private Integer age;

    private Integer agehumain;

    private LocalDate arrivee;

    public double deathrate;

    //endregion

    //region Constructeurs
    public Animaux(String name, Double poids, Double taille, boolean sexe, Integer age, LocalDate arrivee) {
        this.name = name;
        this.poids = poids;
        this.taille = taille;
        this.sexe = sexe;
        this.age = age;
        this.arrivee = arrivee;
        //ageHumain();
    }


    //endregion
    //region Setter & Getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPoids() {
        return poids;
    }

    public void setPoids(Double poids) {
        this.poids = poids;
    }

    public Double getTaille() {
        return taille;
    }

    public void setTaille(Double taille) {
        this.taille = taille;
    }

    public boolean isSexe() {
        return sexe;
    }

    public void setSexe(boolean sexe) {
        this.sexe = sexe;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getAgehumain() {
        return agehumain;
    }

    public void setAgehumain(Integer agehumain) {
        this.agehumain = agehumain;
    }

    public LocalDate getArrivee() {
        return arrivee;
    }

    public double getDeathrate() {
        return deathrate;
    }

    public void setArrivee(LocalDate arrivee) {
        this.arrivee = arrivee;
    }

    //endregion

    public void crier() {
        System.out.println("Je crie!");
    }


    public void sexe() {
        if (this.sexe == true) {
            System.out.println(this.name + " est une femelle");
        } else {
            System.out.println(this.name + " est un mâle");
        }
    }


    public void ageHumain() {
        this.agehumain = this.age * 7;
        System.out.println("l'âge humain de " + this.name + " est de " + agehumain + " ans.");

    }

    public void whoDied(ArrayList h) {
        Random count = new Random();
        double death = count.nextDouble(0, 1);
        for (Object a : h) {

            if (death < this.deathrate) {
                System.out.println(a + " est mort !");

                h.remove(a);
            }
        }
    }
}



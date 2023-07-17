package be.storm.animalerie;

import java.time.LocalDate;

public class Animaux {

    public String name;
    public Double poids;
    public Double taille;

    public boolean sexe;

    public Integer age;

    public Integer agehumain;

    public LocalDate arrivee;

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

    public void setArrivee(LocalDate arrivee) {
        this.arrivee = arrivee;
    }

    public void crier() {
        System.out.println("Je crie!");
    }

    public void whoDied(Animaux a, double death) {


    }
}

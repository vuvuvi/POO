package be.storm.banque;

import java.time.LocalDate;

public class Personne {
//attributs
    private String name;
    private String firstName;
    private LocalDate birthDate;

    //constructeurs
    public Personne(String name, String firstName){
        this.name = name;
        this.firstName = firstName;
    }
    public Personne(String name, String firstName, LocalDate birthDate ) {
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }
//propriété
    public String getNom(){
        return this.name;
    }
    public void setName(String name){
        if (name.trim().equals("")) {
            return;}
        this.name = name;
    }

    public String getfirstName(){
        return this.firstName;
    }
    public void setfirstName(String name){
        if (birthDate.isAfter(LocalDate.now())) {
            return;}
        this.firstName = name;
    }
    public LocalDate getBirthDate(){
        return this.birthDate;
    }
    public void setBirthDate(LocalDate birthDate){
        if (birthDate.equals("")) {
            return;}
        this.birthDate = birthDate;
    }
    public void afficher() {

        System.out.println("Nom : "  + name);
        System.out.println("Prénom : " + firstName);
        if(birthDate != null) {

            System.out.println( "Age = " + calculerAge());
        };

    }

    //méthodes

    public int calculerAge() {
        int age = LocalDate.now().getYear() - birthDate.getYear();

        if (age <0 ) {
            System.out.println("ERROR 404");
            return 0;
        } else {

            return age;
        }
    }




}

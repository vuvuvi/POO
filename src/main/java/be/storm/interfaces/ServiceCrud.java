package be.storm.interfaces;

import be.storm.demoStatic.Movie;

public class ServiceCrud  {

    private Crud crud;

    public ServiceCrud(Crud crud) {
        this.crud = crud;
    }

    public void add(Movie m){

        crud.create(m);
    }
}

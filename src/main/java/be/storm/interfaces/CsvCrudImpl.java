package be.storm.interfaces;

import be.storm.demoStatic.Movie;

import java.util.List;

//autre moyen d'implementer un film genre excel.
public class CsvCrudImpl implements Crud, CrudFille{

    @Override
    public void create(Movie m) {

    }

    @Override
    public Movie readOne(int id) {
        return null;
    }

    @Override
    public List<Movie> readAll() {
        return null;
    }

    @Override
    public boolean update(int id, Movie newMovie) {
        return false;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Movie getbyTitle(String title) {
        return null;
    }
}

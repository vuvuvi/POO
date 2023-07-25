package be.storm.interfaces;

import be.storm.demoStatic.Movie;

import java.util.List;

public interface CrudFille extends Crud{

    Movie getbyTitle(String title);

}

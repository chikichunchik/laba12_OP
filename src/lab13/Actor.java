package lab13;

import Exeptions.IllegalSymbolsExсeption;

import java.util.HashSet;
import java.util.Objects;

public class Actor {

    private String name;
    private HashSet<Movie> movies;

    public Actor (String name) throws IllegalSymbolsExсeption {
        this.movies = new HashSet<>();
        this.setName(name);
    }

    private void setName(String name) throws Exeptions.IllegalSymbolsExсeption{
        String lowerInput = name.toLowerCase();
        if (!lowerInput.matches("[a-z]{2,40}"))   // ������� a-z �� 2 �� 40
        {
            throw new Exeptions.IllegalSymbolsExсeption("Name " + name + " contains illegal symbols");
        }
        this.name = name;
    }

    public void addMovie (Movie movie){
        if(this.getMovies().contains(movie)){
            System.out.println("This movie is already in this actor");
            return;
        }
        movies.add(movie);
        if(!movie.getActors().contains(this)){
            movie.addActor(this);
        }
    }

    public String getName() {
        return name;
    }

    public HashSet<Movie> getMovies() {
        return movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return name.equals(actor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

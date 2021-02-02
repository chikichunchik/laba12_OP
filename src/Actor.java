import java.util.HashSet;
import java.util.Objects;

public class Actor {

    String name;
    HashSet<Movie> movies;

    public Actor (String name, DataBase dataBase){
        this.name = name;
        this.movies = new HashSet<>();
        dataBase.addActor(this);
    }

    public Actor (String name){
        this.name = name;
        this.movies = new HashSet<>();
    }

    public void addMovie (Movie movie){
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

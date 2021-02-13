package lab13;
import java.util.HashSet;
import java.util.Objects;

public class DataBase {

    private HashSet<Movie> movies;
    private HashSet<Actor> actors;

    public DataBase() {
        this.actors = new HashSet<>();
        this.movies = new HashSet<>();
    }

    public void addMovie (Movie movie){
        movies.add(movie);
    }

    public void addActor (Actor actor){
        actors.add(actor);
    }

    public HashSet<Movie> getMovies() {
        return movies;
    }

    public HashSet<Actor> getActors() {
        return actors;
    }
}

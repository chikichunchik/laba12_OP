import java.util.HashSet;
import java.util.Objects;

public class DataBase {

    private HashSet<Movie> movies = new HashSet<>();
    private HashSet<Actor> actors = new HashSet<>();

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

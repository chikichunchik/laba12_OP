import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
public class Tasks {

	public static void main(String[] args) {
	}
	public static boolean isActorWithoutMovie (DataBase dataBase){
        return  true;
    }

    public static HashMap<Integer, Actor> moviePartners (Actor actor, DataBase dataBase){
        return null;
    }

    public static Movie maxActorsMovie (DataBase dataBase){
    	int maxActors=0;
    	Movie largeMovie = new Movie("");
    	
    	for(Iterator<Movie> i=dataBase.movies.iterator();i.hasNext();) {
    		Movie movie = i.next();
    		if (movie.actors.size()>maxActors) {
    			maxActors=movie.actors.size();
    			largeMovie=movie;
    		}
    	}
    	return largeMovie;

    }
}


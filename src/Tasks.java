import java.util.HashSet;
import java.util.Iterator;
import java.util.HashMap;
public class Tasks {

	public static boolean isActorWithoutMovie (DataBase dataBase){
        return  true;
    }

    public static HashMap<Integer, Actor> moviePartners (Actor actor){
		try {
			if (actor == null) { throw new IllegalArgumentException("Actor must not be null"); }
			HashMap<Integer, Actor> partners = new HashMap<>();
			for (Movie actorsMovie : actor.getMovies()) {
				for (Actor partner : actorsMovie.getActors()) {
					if (!partner.equals(actor)) {
						partners.put(partner.hashCode(), partner);
					}
				}
			}
			return partners;
		} catch (IllegalArgumentException error){
			System.out.println("EXCEPTION! " + error.getMessage());
			return null;
		}
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


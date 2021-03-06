package lab13;
import java.util.HashSet;
import java.util.Iterator;

import Exceptions.NullActorException;
import Exceptions.NullDatabaseException;

import java.util.HashMap;
public class Tasks {

	public static boolean isActorWithoutMovie(DataBase dataBase) throws NullDatabaseException {
		if (dataBase == null) {
			throw new NullDatabaseException("DataBase must not be null");
		}
		Iterator<Actor> actorIterator = dataBase.getActors().iterator();
		while (actorIterator.hasNext()) {
			if (actorIterator.next().getMovies().isEmpty()) return true;
		}
		return false;
	}

	public static HashSet<Actor> getActorsWithoutMovie(DataBase dataBase) throws NullDatabaseException {
		if (dataBase == null) {
			throw new NullDatabaseException("DataBase must not be null");
		}
		HashSet<Actor> unemployed = new HashSet<>();

		Iterator<Actor> actorIterator = dataBase.getActors().iterator();
		while (actorIterator.hasNext()) {
			Actor actor = actorIterator.next();
			if (actor.getMovies().isEmpty()) {
				unemployed.add(actor);
			}
		}
		return unemployed;
	}

	public static HashMap<Integer, Actor> moviePartners(Actor actor) throws NullActorException {
		if (actor == null) {
			throw new NullActorException("Actor must not be null");
		}
		HashMap<Integer, Actor> partners = new HashMap<>();
		for (Movie actorsMovie : actor.getMovies()) {
			for (Actor partner : actorsMovie.getActors()) {
				if (!partner.equals(actor)) {
					partners.put(partner.hashCode(), partner);
				}
			}
		}
		return partners;
	}

	public static HashSet<Movie> maxActorsMovie(DataBase dataBase) throws NullDatabaseException {
		HashSet<Movie> movies = new HashSet<>();
		if (dataBase == null) {
			throw new NullDatabaseException("DataBase must not be null");
		}
		int maxActors = 0;

		for (Iterator<Movie> i = dataBase.getMovies().iterator(); i.hasNext(); ) {
			Movie movie = i.next();
			if (movie.getActors().size() > maxActors) {
				maxActors = movie.getActors().size();
				movies.clear();
			}
			if (movie.getActors().size() == maxActors) {
				movies.add(movie);
			}
		}
		return movies;
	}
}


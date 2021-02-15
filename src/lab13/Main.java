package lab13;
import java.util.HashSet;

import Exceptions.IllegalSymbolsException;
import Exceptions.NullActorException;
import Exceptions.NullDatabaseException;

public class Main {

    public static void main (String[] args) throws NullDatabaseException, IllegalSymbolsException {
        DataBase dataBase = new DataBase();
        Actor john = new Actor("John");
        Actor bella = new Actor("Bella");
        Actor igor = new Actor("Igor");
        Actor mary = new Actor("Mary");
        Actor kate = new Actor("Kate");
        //Actor mate = new Actor("Mate11");
        //Actor ew = new Actor("e");
        //Actor eq = new Actor("esadfsadcfksajdfsaicfuiosdfiodsfklsdjfjsdfjsdjfsdjfksdjfksjdfkljsdkfljsdkljfklsdjfkjf");

        dataBase.addActor(john);
        dataBase.addActor(bella);
        dataBase.addActor(igor);
        dataBase.addActor(mary);
        dataBase.addActor(kate);
        

        Movie predator = new Movie("Predator");
        Movie madmax = new Movie("MadMax");

        dataBase.addMovie(predator);
        dataBase.addMovie(madmax);

        predator.addActor(john);
        predator.addActor(bella);
         
        bella.addMovie(madmax);
        igor.addMovie(madmax);

        System.out.println("*** Task 1 ***");

        if (Tasks.isActorWithoutMovie(dataBase)) {
            System.out.println("There is at least 1 actor who did not appear in any movie:");
            for (Actor actor: Tasks.getActorsWithoutMovie(dataBase)) {
                System.out.println(actor.getName());
            }
        } else {
            System.out.println("There are no actors who did not appear in any movie");
        }
        System.out.println("*** Task 2 ***");

        try {
        	System.out.println("Actors who appeared with given actor in the film: \n" + Tasks.moviePartners(john));
        }
        catch (IllegalArgumentException | NullActorException e) {
        	System.out.println("EXCEPTION"+e.getMessage());
		}

        System.out.println("*** Task 3 ***");
        try {
        	System.out.println("Film with the biggest number of actors: ");
        	HashSet<Movie> movies = Tasks.maxActorsMovie(null);
        	for(Movie movie: movies) {
        		System.out.println(movie);
        	}
        }
        catch (NullDatabaseException e) {
        	System.out.println("EXCEPTION: "+e.getMessage());
		} finally {
			System.out.println("Task 3 is over");
		}

    }

}

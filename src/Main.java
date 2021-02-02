import java.util.HashMap;

public class Main {

    public static void main (String[] args){
        DataBase dataBase = new DataBase();
        Actor john = new Actor("John", dataBase);
        Actor bella = new Actor("Bella", dataBase);
        Actor igor = new Actor("Igor", dataBase);

        Movie predator = new Movie("Predator" , dataBase);
        Movie madmax = new Movie("MadMax", dataBase);

        predator.addActor(john);
        madmax.addActor(bella);
        madmax.addActor(igor);
        try {
        	Movie movie = Tasks.maxActorsMovie(dataBase);
        	System.out.println(movie);
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}
        try {
        	HashMap<Integer, Actor> partners =Tasks.moviePartners(john);
        	System.out.println(partners);
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}

    }

}

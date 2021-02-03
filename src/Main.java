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
        predator.addActor(bella);
        madmax.addActor(bella);
        madmax.addActor(igor);
        try {
        	System.out.println(Tasks.maxActorsMovie(dataBase));
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}
        try {
        	System.out.println(Tasks.moviePartners(john));
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}

    }

}

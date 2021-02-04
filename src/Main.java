import java.util.HashMap;

public class Main {

    public static void main (String[] args){
        DataBase dataBase = new DataBase();
        Actor john = new Actor("John", dataBase);
        Actor bella = new Actor("Bella", dataBase);
        Actor igor = new Actor("Igor", dataBase);
        Actor mary = new Actor("Mary", dataBase);
        Actor kate = new Actor("Kate", dataBase);

        Movie predator = new Movie("Predator" , dataBase);
        Movie madmax = new Movie("MadMax", dataBase);

        predator.addActor(john);
        predator.addActor(bella);

        john.addMovie(predator);
        bella.addMovie(predator);

        madmax.addActor(bella);
        madmax.addActor(igor);

        bella.addMovie(madmax);
        igor.addMovie(madmax);

        System.out.println("*** Завдання 1 ***");

        if (Tasks.isActorWithoutMovie(dataBase)) {
            System.out.println("Є принаймні 1 актор, що не знімався у жодному фільмі:");
            for (Actor actor: Tasks.getActorsWithoutMovie(dataBase)) {
                System.out.println(actor.getName());
            }
        } else {
            System.out.println("Акторів, які б не зіграли у жодному фільмі, немає");
        }
        System.out.println("*** Завдання 2 ***");

        try {
        	System.out.println(Tasks.maxActorsMovie(dataBase));
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}

        System.out.println("*** Завдання 3 ***");
        try {
        	System.out.println(Tasks.moviePartners(john));
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}

    }

}

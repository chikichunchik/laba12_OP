import java.util.HashMap;

public class Main {

    public static void main (String[] args){
        DataBase dataBase = new DataBase();
        Actor john = new Actor("John");
        Actor bella = new Actor("Bella");
        Actor igor = new Actor("Igor");
        Actor mary = new Actor("Mary");
        Actor kate = new Actor("Kate");

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
        	System.out.println("Актори, що грали з заданим актором в одному фільмі: \n" + Tasks.moviePartners(john));
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}

        System.out.println("*** Завдання 3 ***");
        try {
        	System.out.println("Фільм з найбільшою кількістю акторів: \n" + Tasks.maxActorsMovie(dataBase));
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}

    }

}

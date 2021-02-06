import java.util.HashMap;
import java.util.HashSet;

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

        System.out.println("*** �������� 1 ***");

        if (Tasks.isActorWithoutMovie(dataBase)) {
            System.out.println("� �������� 1 �����, �� �� ������� � ������� �����:");
            for (Actor actor: Tasks.getActorsWithoutMovie(dataBase)) {
                System.out.println(actor.getName());
            }
        } else {
            System.out.println("������, �� � �� ������ � ������� �����, ���ດ");
        }
        System.out.println("*** �������� 2 ***");

        try {
        	System.out.println("������, �� ����� � ������� ������� � ������ �����: \n" + Tasks.moviePartners(john));
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}

        System.out.println("*** �������� 3 ***");
        try {
        	System.out.println("Գ��� � ��������� ������� ������: ");
        	HashSet<Movie> movies = Tasks.maxActorsMovie(dataBase);
        	for(Movie movie: movies) {
        		System.out.println(movie);
        	}
        }
        catch (IllegalArgumentException e) {
        	System.out.println("EXEPTION"+e.getMessage());
		}

    }

}

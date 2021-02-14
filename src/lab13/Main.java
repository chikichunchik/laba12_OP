package lab13;
import java.util.HashMap;
import java.util.HashSet;

import Exeptions.IllegalSymbolsExeption;
import Exeptions.NullDatabaseExeption;

public class Main {

    public static void main (String[] args) throws NullDatabaseExeption  {
        DataBase dataBase = new DataBase();
        Actor john = Tasks.createActor("John");
        Actor bella = Tasks.createActor("Bella");
        Actor igor = Tasks.createActor("Igor");
        Actor mary = Tasks.createActor("Mary");
        Actor kate = Tasks.createActor("Kate");
        Actor mate = Tasks.createActor("Mate11");
        Actor ew = Tasks.createActor("e");
        Actor eq = Tasks.createActor("esadfsadcfksajdfsaicfuiosdfiodsfklsdjfjsdfjsdjfsdjfksdjfksjdfkljsdkfljsdkljfklsdjfkjf");

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
        	HashSet<Movie> movies = Tasks.maxActorsMovie(null);
        	for(Movie movie: movies) {
        		System.out.println(movie);
        	}
        }
        catch (NullDatabaseExeption e) {
        	System.out.println("EXEPTION: "+e.getMessage());
		} finally {
			System.out.println("Task 3 is over");
		}

    }

}

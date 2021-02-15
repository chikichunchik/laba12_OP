package lab13;
import java.util.HashMap;
import java.util.HashSet;

import Exeptions.IllegalSymbolsExeption;
import Exeptions.NullDatabaseExeption;

public class Main {

    public static void main (String[] args) throws NullDatabaseExeption, IllegalSymbolsExeption {
        DataBase dataBase = new DataBase();
        Actor john = new Actor("John");
        Actor bella = new Actor("Bella");
        Actor igor = new Actor("Igor");
        Actor mary = new Actor("Mary");
        Actor kate = new Actor("Kate");
        Actor mate = new Actor("Mate11");
        Actor ew = new Actor("e");
        Actor eq = new Actor("esadfsadcfksajdfsaicfuiosdfiodsfklsdjfjsdfjsdjfsdjfksdjfksjdfkljsdkfljsdkljfklsdjfkjf");

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

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


    }

}

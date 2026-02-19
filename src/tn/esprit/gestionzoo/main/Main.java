package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
public class Main
{
    public static void main(String[] args)
    {
        Zoo zoo1=new Zoo("Esprit Zoo","Tunis");
        Zoo zoo2=new Zoo("Friguia","Sousse");
        Animal lion=new Animal("Felidae","Lion",5,true);
        Animal tiger=new Animal("Felidae","Tiger",4,true);
        Animal snake=new Animal("Reptile","Snake",2,false);
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        zoo1.addAnimal(snake);
        zoo1.displayZoo();
        zoo1.displayAnimals();
        System.out.println(zoo1.searchAnimal("Lion"));
        zoo1.removeAnimal("Tiger");
        zoo1.displayAnimals();
        zoo2.addAnimal(lion);
        System.out.println(Zoo.compareZoo(zoo1,zoo2));
        /*Prosit 05*/
        Aquatic aquatic = new Aquatic("arthropoda", "crab", 2, false, "lagoon");
        Terrestrial terrestrial = new Terrestrial("equidae", "zebra", 6, true, 4);
        Dauphin dolphin = new Dauphin("delphinidae", "wave", 9, true, "atlantic", 58.4f);
        Pingouin penguin = new Pingouin("spheniscidae", "frost", 3, false, "arctic coast", 22.1f);
        System.out.println(aquatic);
        System.out.println(terrestrial);
        System.out.println(dolphin);
        System.out.println(penguin);
        aquatic.swim();
        dolphin.swim();
        penguin.swim();
    }
}
package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
public class Main
{
    public static void main(String[] args)
    {
        Zoo zoo1=new Zoo("esprit zoo","tunis");
        Zoo zoo2=new Zoo("friguia","sousse");
        Animal lion=new Animal("felidae","lion",5,true);
        Animal tiger=new Animal("felidae","tiger",4,true);
        Animal snake=new Animal("reptile","snake",2,false);
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tiger);
        zoo1.addAnimal(snake);
        zoo1.displayZoo();
        zoo1.displayAnimals();
        System.out.println(zoo1.searchAnimal("lion"));
        zoo1.removeAnimal("tiger");
        zoo1.displayAnimals();
        zoo2.addAnimal(lion);
        System.out.println(Zoo.compareZoo(zoo1,zoo2));
        Dauphin d1=new Dauphin("delphinidae","wave",5,true,"sea",40.5f);
        Dauphin d2=new Dauphin("delphinidae","wave",5,true,"sea",35.0f);
        Pingouin p1=new Pingouin("spheniscidae","ice",3,false,"antarctica",25.0f);
        Pingouin p2=new Pingouin("spheniscidae","snow",4,false,"antarctica",30.0f);
        zoo1.addAquaticAnimal(d1);
        zoo1.addAquaticAnimal(d2);
        zoo1.addAquaticAnimal(p1);
        zoo1.addAquaticAnimal(p2);
        zoo1.swimAll();
        System.out.println(zoo1.maxPenguinDepth());
        zoo1.countAquaticsByType();
        System.out.println(d1.equals(d2));
    }
}
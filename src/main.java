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
    }
}
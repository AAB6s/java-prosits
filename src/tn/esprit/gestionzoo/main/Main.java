package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;
public class Main
{
    public static void main(String[] args)
    {
        // Test Prosit 7: Exception Handling
        Zoo zoo1=new Zoo("esprit zoo","tunis", 3);

        // Test 1: Valid animals
        System.out.println("=== Test 1: Adding valid animals ===");
        Animal lion=new Animal("felidae","lion",5,true);
        try {
            zoo1.addAnimal(lion);
            System.out.println("Lion added successfully. Animal count: " + zoo1.getAnimalCount());
        } catch(ZooFullException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Animal tiger=new Animal("felidae","tiger",4,true);
        try {
            zoo1.addAnimal(tiger);
            System.out.println("Tiger added successfully. Animal count: " + zoo1.getAnimalCount());
        } catch(ZooFullException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        Animal snake=new Animal("reptile","snake",2,false);
        try {
            zoo1.addAnimal(snake);
            System.out.println("Snake added successfully. Animal count: " + zoo1.getAnimalCount());
        } catch(ZooFullException | InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 2: Animal with negative age
        System.out.println("\n=== Test 2: Adding animal with negative age ===");
        Animal bear=new Animal("ursidae","bear",-3,true);
        try {
            zoo1.addAnimal(bear);
            System.out.println("Bear added successfully. Animal count: " + zoo1.getAnimalCount());
        } catch(InvalidAgeException e) {
            System.out.println("Error handling negative age: " + e.getMessage());
            System.out.println("Animal count after failed attempt: " + zoo1.getAnimalCount());
        } catch(ZooFullException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test 3: Exceed zoo capacity
        System.out.println("\n=== Test 3: Exceeding zoo capacity ===");
        Animal elephant=new Animal("elephantidae","elephant",10,true);
        try {
            zoo1.addAnimal(elephant);
            System.out.println("Elephant added successfully. Animal count: " + zoo1.getAnimalCount());
        } catch(ZooFullException e) {
            System.out.println("Error handling full zoo: " + e.getMessage());
            System.out.println("Animal count after failed attempt: " + zoo1.getAnimalCount());
        } catch(InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Test with Aquatic animals
        System.out.println("\n=== Aquatic Animals ===");
        Zoo zoo2=new Zoo("friguia","sousse");
        Dauphin d1=new Dauphin("delphinidae","wave",5,true,"sea",40.5f);
        Dauphin d2=new Dauphin("delphinidae","wave",5,true,"sea",35.0f);
        Pingouin p1=new Pingouin("spheniscidae","ice",3,false,"antarctica",25.0f);
        Pingouin p2=new Pingouin("spheniscidae","snow",4,false,"antarctica",30.0f);
        zoo2.addAquaticAnimal(d1);
        zoo2.addAquaticAnimal(d2);
        zoo2.addAquaticAnimal(p1);
        zoo2.addAquaticAnimal(p2);
        zoo2.swimAll();
        System.out.println("Max penguin depth: " + zoo2.maxPenguinDepth());
        zoo2.countAquaticsByType();
        System.out.println("d1.equals(d2): " + d1.equals(d2));
    }
}
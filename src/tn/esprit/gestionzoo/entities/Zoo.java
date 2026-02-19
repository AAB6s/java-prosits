package tn.esprit.gestionzoo.entities;
public class Zoo
{
    private Animal[] animals;
    private String name;
    private String city;
    private final int nbrCages = 25;
    private int animalCount;
    public Zoo(String name,String city)
    {
        if(name == null || name.isEmpty())
            this.name = "Unknown";
        else
            this.name = name;

        this.city = city;
        this.animals = new Animal[nbrCages];
        this.animalCount = 0;
    }
    public Zoo()
    {
        this("Unknown","");
    }
    public void displayZoo()
    {
        System.out.println("Zoo:"+name+" City:"+city+" Cages:"+nbrCages);
    }
    public String toString()
    {
        return "Zoo:"+name+" City:"+city+" Cages:"+nbrCages;
    }
    public int searchAnimal(String name)
    {
        for(int i=0;i<animalCount;i++)
            if(animals[i].getName().equals(name)) return i;
        return -1;
    }
    public boolean isZooFull()
    {
        return animalCount==nbrCages;
    }
    public boolean addAnimal(Animal a)
    {
        if(isZooFull() || searchAnimal(a.getName())!=-1) return false;
        animals[animalCount++] = a;
        return true;
    }
    public boolean removeAnimal(String name)
    {
        int i = searchAnimal(name);
        if(i==-1) return false;

        for(int j=i;j<animalCount-1;j++)
            animals[j] = animals[j+1];

        animals[--animalCount] = null;
        return true;
    }
    public void displayAnimals()
    {
        for(int i=0;i<animalCount;i++)
            System.out.println(animals[i]);
    }
    public static Zoo compareZoo(Zoo z1,Zoo z2)
    {
        return z1.animalCount>z2.animalCount?z1:z2;
    }
    public String getName()
    {
        return name;
    }
    public String getCity()
    {
        return city;
    }
    public int getAnimalCount()
    {
        return animalCount;
    }
}
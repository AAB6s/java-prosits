public class Zoo
{
    Animal[] animals;
    String name;
    String city;
    final int nbrCages = 25;
    int animalCount;
    public Zoo(String name,String city)
    {
        this.name=name;
        this.city=city;
        this.animals=new Animal[nbrCages];
        this.animalCount=0;
    }
    public Zoo()
    {
        this("","");
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
            if(animals[i].name.equals(name)) return i;
        return -1;
    }
    public boolean isZooFull()
    {
        return animalCount==nbrCages;
    }
    public boolean addAnimal(Animal a)
    {
        if(isZooFull()||searchAnimal(a.name)!=-1) return false;
        animals[animalCount++]=a;
        return true;
    }
    public boolean removeAnimal(String name)
    {
        int i=searchAnimal(name);
        if(i==-1) return false;
        for(int j=i;j<animalCount-1;j++)
            animals[j]=animals[j+1];
        animals[--animalCount]=null;
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
}
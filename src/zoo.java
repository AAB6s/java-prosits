public class Zoo
{
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    public Zoo(){this("","",0);}
    public Zoo(String name,String city,int nbrCages)
    {
        this.name=name;
        this.city=city;
        this.nbrCages=nbrCages;
        this.animals=new Animal[25];
    }
    public void displayZoo(){System.out.println("Zoo:"+name+" City:"+city+" Cages:"+nbrCages);}
    public String toString(){return "Zoo:"+name+" City:"+city+" Cages:"+nbrCages;}
}
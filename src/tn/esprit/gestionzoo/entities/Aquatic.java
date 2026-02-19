package tn.esprit.gestionzoo.entities;
public abstract class Aquatic extends Animal 
{
    protected String habitat;
    public Aquatic(){}
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat)
    {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }
    public abstract void swim();
    public boolean equals(Object obj) 
    {
        if (obj instanceof Aquatic) 
        {
            Aquatic other = (Aquatic) obj;
            return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.habitat.equals(other.habitat);
        }
        return false;
    }
    public String toString() 
    {
        return super.toString() + " habitat=" + habitat;
    }
}
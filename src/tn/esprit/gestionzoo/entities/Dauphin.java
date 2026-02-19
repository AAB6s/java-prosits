package tn.esprit.gestionzoo.entities;
public class Dauphin extends Aquatic
{
  protected float swimmingSpeed;
  public Dauphin(){}
  public Dauphin (String family,String name,int age,boolean isMammal, String habitat, float swimmingSpeed)
  {
    super(family, name, age, isMammal, habitat);
    this.swimmingSpeed = swimmingSpeed;
  }
  public String toString()
  {
    return super.toString()+" SwimmingSpeed:"+swimmingSpeed;
  }
  public void swim()
  {
    System.out.println("This dolphin is swimming.");
  }
}
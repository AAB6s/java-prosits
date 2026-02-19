package tn.esprit.gestionzoo.entities;
public class Pingouin extends Aquatic
{
  protected float swimmingDepth;
  public Pingouin(){}
  public Pingouin (String family,String name,int age,boolean isMammal, String habitat, float swimmingDepth)
  {
    super(family, name, age, isMammal, habitat);
    this.swimmingDepth = swimmingDepth;
  }
  public String toString()
  {
    return super.toString()+" SwimmingDepth:"+swimmingDepth;
  }
}
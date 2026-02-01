public class Main
{
    public static void main(String[] args){
        Animal lion=new Animal("Felidae","Lion",5,true);
        Animal tiger=new Animal("Felidae","Tiger",4,true);
        Zoo myZoo=new Zoo("Esprit Zoo","Tunis",20);
        myZoo.animals[0]=lion;
        myZoo.animals[1]=tiger;
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(lion);
        System.out.println(tiger);
    }
}
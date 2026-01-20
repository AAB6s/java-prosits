import java.util.Scanner;
public class ZooManagement 
{
    int nbrCages = 20;
    String zooName = "my zoo";
    public static void main(String[] args) 
    {
        ZooManagement zoo = new ZooManagement();
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        Scanner sc = new Scanner(System.in);
        do 
        {
            zoo.zooName = sc.nextLine();
        } while (zoo.zooName.trim().isEmpty());
        do 
        {
            while (!sc.hasNextInt()) sc.next();
            zoo.nbrCages = sc.nextInt();
        } while (zoo.nbrCages <= 0);
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages");
        sc.close();
    }
}
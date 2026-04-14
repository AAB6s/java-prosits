import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        Employe e1 = new Employe(3, "Ben Ali", "Ahmed", "IT", 2);
        Employe e2 = new Employe(1, "Trabelsi", "Sarra", "RH", 1);
        Employe e3 = new Employe(5, "Mansouri", "Youssef", "IT", 1);
        Employe e4 = new Employe(2, "Jlassi", "Oumaima", "Finance", 3);
        Employe e5 = new Employe(4, "Abid", "Meriem", "IT", 1);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);

        System.out.println("Liste initiale :");
        societe.displayEmploye();

        System.out.println("\nRecherche par nom 'Abid' : " + societe.rechercherEmploye("Abid"));
        System.out.println("Recherche employe e3 : " + societe.rechercherEmploye(e3));

        System.out.println("\nTri par id :");
        societe.trierEmployeParId();
        societe.displayEmploye();

        System.out.println("\nTri par departement, grade, nom :");
        societe.trierEmployeParNomDepartementEtGrade();
        societe.displayEmploye();

        System.out.println("\nRecherche avancee departement IT :");
        List<Employe> itList = societe.rechercherParDepartement("IT");
        for (Employe e : itList) {
            System.out.println(e);
        }

        System.out.println("\nSuppression de e2 :");
        societe.supprimerEmploye(e2);
        societe.displayEmploye();
    }
}

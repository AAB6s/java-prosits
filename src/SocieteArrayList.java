import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> 
{
    private final ArrayList<Employe> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe e) {
        if (e != null && !rechercherEmploye(e)) 
            employes.add(e);
    }
    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : employes) 
            if (e.getNom() != null && e.getNom().equalsIgnoreCase(nom))
                return true;
        return false;
    }
    @Override
    public boolean rechercherEmploye(Employe e) 
    {
        return employes.contains(e);
    }
    @Override
    public void supprimerEmploye(Employe e) 
    {
        employes.remove(e);
    }
    @Override
    public void displayEmploye() 
    {
        for (Employe e : employes) 
        {
            System.out.println(e);
        }
    }
    @Override
    public void trierEmployeParId() 
    {
        employes.sort(null);
    }
    @Override
    public void trierEmployeParNomDepartementEtGrade() 
    {
        employes.sort(Comparator.comparing(Employe::getNomDepartement, String.CASE_INSENSITIVE_ORDER).thenComparingInt(Employe::getGrade).thenComparing(Employe::getNom, String.CASE_INSENSITIVE_ORDER));
    }
    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) 
    {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : employes) 
            if (e.getNomDepartement() != null && e.getNomDepartement().equalsIgnoreCase(nomDepartement))
                resultat.add(e);
        return resultat;
    }
}
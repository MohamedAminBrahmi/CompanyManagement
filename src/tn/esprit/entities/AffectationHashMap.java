package tn.esprit.entities;

import java.util.*;

public class AffectationHashMap {
    Map<Emlpoye,Department> hMap=new HashMap<>();

    public void ajouterEmployeDepartement(Emlpoye e,Department d){
        hMap.put(e,d);

    }
    public void afficherEmployesEtDepartements(){
        for (Map.Entry<Emlpoye, Department> entry : hMap.entrySet()) {
            Emlpoye employe = entry.getKey();
            Department departements = entry.getValue();
            System.out.println("Employé: " + employe.getNom() + " -> Départements: " + departements);
        }

    }
    public void supprimerEmploye (Emlpoye e){
        hMap.remove(e);
    }
    public void supprimerEmployeEtDepartementWithFunction (Emlpoye e,Department d){
       if (hMap.remove(e,d)){
           System.out.println("Employe removed suceesfully");
       }else {
           System.out.println("Employe does not exists");

       }
    }

    public void supprimerEmployeEtDepartement (Emlpoye e,Department d){
        if (hMap.remove(e,d)){
            System.out.println("Employe removed suceesfully");
        }else {
            System.out.println("Employe does not exists");

        }
    }
    public void afficherEmployes(){
        Set empSet = hMap.keySet();
        Iterator it = empSet.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
    public void afficherDepartements(){
        Collection departments = hMap.values();
        System.out.println(departments);
    }

    public boolean rechercherEmploye (Emlpoye e) {

       return hMap.containsKey(e);

    }
    public boolean rechercherDepartment (Department d) {

        return hMap.containsValue(d);

    }
    public TreeMap<Emlpoye, Department> trierMap(){
        TreeMap<Emlpoye, Department> sortedMap = new TreeMap<>(hMap);

        return sortedMap;
    }

}

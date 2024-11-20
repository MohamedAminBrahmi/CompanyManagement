package tn.esprit.entities;

import tn.esprit.Interfaces.IDepartement;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Department> {

    Set mySet = new HashSet();

    public void ajouterDepartement(Department dep){
        mySet.add(dep);
    }
    public boolean rechercherDepartement(String nom){
        return mySet.contains(nom);
    }
    public boolean rechercherDepartement(Department dep){
        return mySet.contains(dep);

    }
    public void supprimerDepartement(Department dep){
        mySet.remove(dep);

    }

    public void displayDepartement(){
        System.out.println(mySet);

    }



    public TreeSet<Department> trierDepartementById(){
        return  new TreeSet<>(mySet);

    }





}

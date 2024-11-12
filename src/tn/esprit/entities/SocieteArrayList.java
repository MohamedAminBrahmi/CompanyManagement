package tn.esprit.entities;
import tn.esprit.Interfaces.IGestion;

import java.util.Collections;
import java.util.List;

import java.util.ArrayList;

public class SocieteArrayList implements IGestion<Emlpoye> {
    List list =new ArrayList();

    public void ajouterEmploye(Emlpoye emp){
        list.add(emp);
    }
    public boolean rechercherEmploye(String nom){
        return list.contains(nom);
    }
    public boolean rechercherEmploye(Emlpoye emp){
        return list.contains(emp);


    }
    public void supprimerEmploye(Emlpoye emp){
        list.remove(emp) ;
    }
    public void displayEmploye(){
        System.out.println(list);
    }

    public void trierEmployeParId(){
        Collections.sort(list);
    }

    public void trierEmployeParNomDépartementEtGrade(){
        Collections.sort(list, new ComparatorParNomDépartementEtGrade());

    }


    @Override
    public String toString() {
        return "SocieteArrayList{" +
                "list=" + list +
                '}';
    }
}

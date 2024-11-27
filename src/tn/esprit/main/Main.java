package tn.esprit.main;

import tn.esprit.entities.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Emlpoye Ahmed =new Emlpoye(1,"Ahmed","Allegui","Informatique",1);
        Emlpoye mahdi =new Emlpoye(2,"Mahdi","Nasri","Informatique",5);
        Emlpoye hamza =new Emlpoye(3,"Hamza","Kaabi","Technique",4);
        Emlpoye wadie =new Emlpoye(4,"Wadie","Chernie","Technique",6);
        Emlpoye medamin =new Emlpoye(5,"Mohamed Amin","Brahmi","Informatique",7);

        SocieteArrayList societe = new SocieteArrayList();

        societe.ajouterEmploye(Ahmed);
        societe.ajouterEmploye(mahdi);
        societe.ajouterEmploye(medamin);
        societe.ajouterEmploye(hamza);
        societe.ajouterEmploye(wadie);

        System.out.println(societe);
        System.out.println(societe.rechercherEmploye(wadie));
        societe.supprimerEmploye(Ahmed);

        societe.displayEmploye();
        societe.trierEmployeParId();
        societe.displayEmploye();
        societe.trierEmployeParNomDépartementEtGrade();
        societe.displayEmploye();
        System.out.println(societe.rechercherEmploye("Wadie"));

        DepartementHashSet depSet = new DepartementHashSet();
        Department informatique = new Department(1,"informatique",3);
        Department technique = new Department(2,"technique",2);
        Department marketing = new Department(3,"marketing",0);
        depSet.ajouterDepartement(informatique);
        depSet.ajouterDepartement(technique);
        depSet.ajouterDepartement(marketing);
        depSet.displayDepartement();
        System.out.println(depSet.rechercherDepartement("informatique"));
        System.out.println(depSet.rechercherDepartement(informatique));
        depSet.supprimerDepartement(marketing);
        depSet.displayDepartement();
        TreeSet<Department> treeSet =depSet.trierDepartementById();
        System.out.println(treeSet);

        AffectationHashMap hMap =new AffectationHashMap();
        hMap.ajouterEmployeDepartement(Ahmed,informatique);
        hMap.ajouterEmployeDepartement(mahdi,informatique);
        hMap.ajouterEmployeDepartement(hamza,technique);
        hMap.ajouterEmployeDepartement(wadie,marketing);
        hMap.afficherEmployesEtDepartements();
        //L'affichage des paires est réalisé de manière désordonnée.
        hMap.afficherEmployes();
        hMap.afficherDepartements();
        hMap.supprimerEmploye(Ahmed);
        System.out.println(hMap.rechercherEmploye(mahdi));
        System.out.println(hMap.rechercherDepartment(informatique));
        System.out.println(hMap.trierMap());







    }
}
package tn.esprit.main;

import tn.esprit.entities.Emlpoye;
import tn.esprit.entities.SocieteArrayList;

import java.util.ArrayList;
import java.util.List;

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





    }
}
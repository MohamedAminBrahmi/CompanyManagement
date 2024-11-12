package tn.esprit.entities;

import tn.esprit.Interfaces.Comparator;

public class Emlpoye implements Comparable<Emlpoye> {

    private int id;
    private String nom;
    private String prenom;
    private String depNom;
    private int garde;

    public Emlpoye() {
    }

    public Emlpoye(int id, String nom, String prenom, String depNom, int garde) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.depNom = depNom;
        this.garde = garde;
    }



    @Override
    public int compareTo(Emlpoye o) {
        return this.id-o.id;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getDepNom() {
        return depNom;
    }

    public int getGarde() {
        return garde;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDepNom(String depNom) {
        this.depNom = depNom;
    }

    public void setGarde(int garde) {
        this.garde = garde;
    }

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if (obj.getClass() == Emlpoye.class) {
            Emlpoye emp = (Emlpoye) obj;
            return id == emp.id && nom.equals(emp.nom);

        }
        return false;
    }

    @Override
    public String toString() {
        return "Emlpoye{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", depNom='" + depNom + '\'' +
                ", garde=" + garde +
                '}';
    }
    
}
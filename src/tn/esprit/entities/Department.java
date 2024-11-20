package tn.esprit.entities;

import java.lang.Comparable;

import java.util.Objects;

public class Department implements Comparable<Department> {
    private int id ;
    private String nomDepartment;
    private int nbrEmploye;

    public Department() {}

    public Department(int id, String nomDepartment, int nbrEmploye) {
        this.id = id;
        this.nomDepartment = nomDepartment;
        this.nbrEmploye = nbrEmploye;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDepartment() {
        return nomDepartment;
    }

    public void setNomDepartment(String nomDepartment) {
        this.nomDepartment = nomDepartment;
    }

    public int getNbrEmploye() {
        return nbrEmploye;
    }

    public void setNbrEmploye(int nbrEmploye) {
        this.nbrEmploye = nbrEmploye;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return id==((Department) obj).id && nomDepartment.equals(((Department) obj).nomDepartment) ;
    }


    @Override
    public int compareTo(Department dep){
        return this.id - dep.id;
    }
    @Override
    public int hashCode() {
        return Objects.hash(id,nomDepartment);
    }

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", nomDepartment='" + nomDepartment + '\'' +
                ", nbrEmploye=" + nbrEmploye +
                '}';
    }
}

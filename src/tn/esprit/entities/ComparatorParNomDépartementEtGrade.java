package tn.esprit.entities;

import java.util.Comparator;

public class ComparatorParNomDépartementEtGrade implements Comparator<Emlpoye>{
    @Override
    public int compare(Emlpoye o1, Emlpoye o2) {
        return (o1.getDepNom().compareTo(o2.getDepNom()));
    }

}

package CompositePattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ManagerBanca implements Angajat {
    private int nrFiliala;
    private String name;

    public ManagerBanca(int id, String name) {
        this.nrFiliala=id;
        this.name = name;
    }
    List<Angajat> angajats = new ArrayList<>();
    @Override
    public void add(Angajat angajat) {
        angajats.add(angajat);
    }

    @Override
    public int getNrFiliala()  {
        return nrFiliala;
    }
    @Override
    public String getName() {
        return name;
    }
    @Override
    public void print() {
        System.out.print("Nr. Filiala: "+ getNrFiliala());
        System.out.println("\tNume: "+ getName());
        Iterator<Angajat> it = angajats.iterator();
        while(it.hasNext())  {
            Angajat angajat = it.next();
            angajat.print();
        }
    }
}

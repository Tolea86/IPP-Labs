package CompositePattern;

public class Creditor implements Angajat {

    private int nrFiliala;
    private String name;


    public Creditor(int id, String name)  {
        this.nrFiliala=id;
        this.name = name;
    }
    @Override
    public void add(Angajat angajat) {
    }
    @Override
    public int getNrFiliala() {
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
    }
}

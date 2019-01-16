package FacadePattern;

public class TangoDep implements Depozite {
    private int sumIntr;
    private String nume;
    private int procent;

    public TangoDep(int sumIntr, String nume) {
        this.sumIntr = sumIntr;
        this.nume = nume;
        this.procent = 3000;
    }

    @Override
    public int calculProcent() {
        return (procent / 100) * sumIntr;
    }

    public String getNume() {
        return nume;
    }

    public int getSumIntr() {
        return sumIntr;
    }

    @Override
    public String infoDepozit() {
        return "Depozitul " + getNume() +
                " ofera " + calculProcent() + " din " +getSumIntr();
    }
}

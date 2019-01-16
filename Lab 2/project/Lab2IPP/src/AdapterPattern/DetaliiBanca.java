package AdapterPattern;

import java.util.Random;

public class DetaliiBanca extends Banca implements ObtineCredit {
    private int filiala;
    private int salariu;
    private final String SPACE = ", ";

    public DetaliiBanca(String denBanca, String denCredit, int salariu, int filiala) {
        super(denBanca, denCredit);
        this.filiala = filiala;
        this.salariu = salariu;
    }

    public int getFiliala() {
        return filiala;
    }

    public int getSalariu() {
        return salariu;
    }

    @Override
    public int calculCredit() {
        int sumaCredit = 0;
        if(salariu > 500 && salariu < 1000) {
            sumaCredit += randomNumber(1000, 500);
        }
        else if(salariu > 1000 && salariu < 2000) {
            sumaCredit += randomNumber(2000, 1000);
        }
        else if (salariu < 500) {
            sumaCredit = 0;
        }
        return sumaCredit;
    }
    int randomNumber(int max, int min) {
        int ranndomNumber = new Random().nextInt(max - min) + min;
        return ranndomNumber;
    }
    @Override
    public String obtineCredit() {
        return getDenBanca()+ SPACE + getDenCredit()
                + SPACE + getFiliala() + SPACE + getSalariu()+ SPACE + calculCredit();
    }
}

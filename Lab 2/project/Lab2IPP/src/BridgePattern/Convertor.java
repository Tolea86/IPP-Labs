package BridgePattern;

import BridgePattern.SchimbValutar;

public class Convertor extends Valuta {
    private int valuta;

    public Convertor(int valuta, SchimbValutar schimbValutar) {
        super(schimbValutar);
        this.valuta = valuta;
    }

    @Override
    public void afiseaza() {
        schimbValutar.convertVal(valuta);
    }
}

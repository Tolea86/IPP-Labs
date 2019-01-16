package BridgePattern;

import BridgePattern.SchimbValutar;

public abstract class Valuta {
    protected SchimbValutar schimbValutar;

    public Valuta(SchimbValutar schimbValutar) {
        this.schimbValutar = schimbValutar;
    }

    public abstract void afiseaza();
}

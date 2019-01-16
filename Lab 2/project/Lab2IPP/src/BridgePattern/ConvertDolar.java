package BridgePattern;

import static java.lang.System.out;

public class ConvertDolar implements SchimbValutar  {
    int dolar = 17; // lei;
    @Override
    public void convertVal(int numeral) {
        out.println( + numeral + " Dolari = " + (numeral * dolar) + " Lei");
    }
}

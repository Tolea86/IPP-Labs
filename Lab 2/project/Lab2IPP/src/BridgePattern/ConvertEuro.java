package BridgePattern;

import static java.lang.System.out;

public class ConvertEuro implements SchimbValutar  {
    int euro = 20; // lei;
    @Override
    public void convertVal(int numeral) {
        out.println( + numeral + " Euro = " + (numeral * euro) + " Lei");
    }
}
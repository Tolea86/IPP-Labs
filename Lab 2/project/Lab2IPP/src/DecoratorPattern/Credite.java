package DecoratorPattern;

public class Credite extends CompBancaDecor {
    private String infoCredite =  "Sectia Creditare";

    public Credite(CompBanca compBanca) {
        super(compBanca);
    }

    public String InfoBanca() {
        return compBanca.InfoBanca() + credite();
    }

    private String credite() {
        return infoCredite;
    }
}

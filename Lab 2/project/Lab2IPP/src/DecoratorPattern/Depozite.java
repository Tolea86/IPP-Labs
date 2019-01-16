package DecoratorPattern;

public class Depozite extends CompBancaDecor {
    private String SPACE = ", ";
    private String infoDepozite = "Sectia Depozite";

    public Depozite(CompBanca compBanca) {
        super(compBanca);
    }

    public String InfoBanca() {
        return compBanca.InfoBanca() + depozite();
    }

    private String depozite() {
        return infoDepozite + SPACE;
    }
}

package DecoratorPattern;

public abstract class CompBancaDecor implements CompBanca {
    protected  CompBanca compBanca;

    public CompBancaDecor(CompBanca compBanca) {
        this.compBanca = compBanca;
    }

    public String InfoBanca() {
        return compBanca.InfoBanca();
    }
}

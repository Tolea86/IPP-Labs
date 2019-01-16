package DecoratorPattern;

public class DenBanca implements CompBanca {

    private String denBanca;

    public DenBanca() {
        denBanca = "MobiasBanca: ";
    }

    @Override
    public String InfoBanca() {
        return denBanca;
    }
}

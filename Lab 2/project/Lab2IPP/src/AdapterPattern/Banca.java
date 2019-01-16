package AdapterPattern;

public class Banca {
    private String denBanca;
    private String denCredit;
    public Banca(String denBanca, String denCredit) {
        this.denBanca = denBanca;
        this.denCredit = denCredit;
    }

    public String getDenBanca() {
        return denBanca;
    }

    public String getDenCredit() {
        return denCredit;
    }
}

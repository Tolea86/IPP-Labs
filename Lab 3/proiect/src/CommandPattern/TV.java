package CommandPattern;

public class TV {
    private int volum = 0;

    public void connect() {
        volum += 2;
        System.out.print("TV Conectat,   ");
        System.out.println("Volum: " + volum);
    }

    public void disconnect() {
        volum -= 2;
        System.out.print("TV Deconectat, ");
        System.out.println("Volum: " + volum);
    }
}

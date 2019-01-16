package FacadePattern;

import static java.lang.System.out;

public class DepoziteBanca {

    private Depozite sonata = new SonataDep(14, "Sonata");
    private Depozite tango = new TangoDep(9, "Tango");
    private Depozite jazz = new JazzDep(3, "Jazz");

    public String informJazz() {
        return jazz.infoDepozit();
    }

    public String informSonata() {
        return sonata.infoDepozit();
    }

    public String informTango() {
        return tango.infoDepozit();
    }
}

package AbstractFactory;

public class iPhonePlus implements TelefonMare {
    public iPhonePlus()
    {
        ConstruiesteEcraneMari();
        ConstruiesteBateriiMari();
    }
    @Override
    public void ConstruiesteEcraneMari() {
        System.out.print("S-a construit AbstractFactory.iPhonePlus cu ecran mare\n");
    }

    @Override
    public void ConstruiesteBateriiMari() { System.out.print("S-a construit AbstractFactory.iPhonePlus cu baterie mare\n"); }
}
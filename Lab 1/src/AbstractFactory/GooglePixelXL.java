package AbstractFactory;

public class GooglePixelXL implements TelefonMare {
    public GooglePixelXL()
    {
        ConstruiesteEcraneMari();
        ConstruiesteBateriiMari();
    }
    @Override
    public void ConstruiesteEcraneMari() {
        System.out.print("S-a construit PixelXL cu ecran mare\n");
    }

    @Override
    public void ConstruiesteBateriiMari() {
        System.out.print("S-a construit PixelXL cu baterie mare\n");
    }
}
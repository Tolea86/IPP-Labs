package AbstractFactory;

public class GooglePixel implements TelefonMic {
    public GooglePixel()
    {
        ConstruiesteBateriiMici();
        ConstruiesteEcraneMici();
    }
    @Override
    public void ConstruiesteEcraneMici() {
        System.out.print("S-a construit Pixel cu ecran mic\n");
    }

    @Override
    public void ConstruiesteBateriiMici() {
        System.out.print("S-a construit Pixel cu baterie mica\n");
    }
}
package AbstractFactory;

public class iPhone implements TelefonMic {
    public iPhone()
    {
        ConstruiesteEcraneMici();
        ConstruiesteBateriiMici();
    }
    @Override
    public void ConstruiesteEcraneMici() {
        System.out.print("S-a construit AbstractFactory.iPhone cu ecran mic\n");
    }

    @Override
    public void ConstruiesteBateriiMici() {
        System.out.print("S-a construit AbstractFactory.iPhone cu baterie mica\n");
    }
}
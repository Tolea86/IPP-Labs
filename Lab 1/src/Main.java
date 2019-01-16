import AbstractFactory.Google;
import Builder.BuilderDirector;
import Builder.GoogleBuilder;
import Builder.PhoneBuilder;
import FactoryMethod.GoogleFM;
import FactoryMethod.IPixel;
import Prototype.AppleIphone;
import Singleton.GoogleSingleton;

public class Main {
    public static void main(String[] args) {
        AbstractFactory.Producator _prod = null;
        String model = "google";

        if(model == "apple")
        {
            _prod = new AbstractFactory.Apple();
        }else if(model == "google")
        {
            _prod = new AbstractFactory.Google();
        }
        if(_prod!=null)
        {
            System.out.println("Abstract Factory");
            _prod.ProduceTelefon();
        }
        //-----------------------------FactoryMethod----------------------------
       System.out.println("\nFactory Method");
        GoogleFM Google = new GoogleFM();
        Google.ConstruiestePixel("Pixel");

        //------------------------------Singleton--------------------------------
        System.out.println("\nSingleton");
        GoogleSingleton GoogleSingleton1 = GoogleSingleton.GetInstance();
        System.out.println("Incercam sa mai cream o instanta");
        GoogleSingleton GoogleSingleton2 = GoogleSingleton.GetInstance();
        //------------------------------Prototype--------------------------------
        System.out.println("\nPrototype");
        AppleIphone AppleIphone = new AppleIphone();
        AppleIphone.Denumire="AppleIphone";
        AppleIphone AppleIphone2 = (Prototype.AppleIphone) AppleIphone.clone();
        System.out.println("Original: "+ AppleIphone.Denumire);
        System.out.println("Clona: "+ AppleIphone2.Denumire);
        //--------------------------------Builder---------------------------------
        System.out.println("\nBuilder");
        BuilderDirector BuilderDirector = new BuilderDirector();
        PhoneBuilder PhoneBuilder;
        PhoneBuilder = new GoogleBuilder();
        BuilderDirector.Build(PhoneBuilder);
        PhoneBuilder.Pixel.ShowData();
    }
}

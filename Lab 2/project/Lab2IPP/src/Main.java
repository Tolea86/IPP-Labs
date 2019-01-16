

import AdapterPattern.ObtineCredit;
import AdapterPattern.DetaliiBanca;
import BridgePattern.ConvertDolar;
import BridgePattern.ConvertEuro;
import BridgePattern.Convertor;
import BridgePattern.Valuta;
import CompositePattern.Angajat;
import CompositePattern.AngajatBanca;
import CompositePattern.Creditor;
import CompositePattern.ManagerBanca;
import DecoratorPattern.CompBanca;
import DecoratorPattern.Credite;
import DecoratorPattern.DenBanca;
import DecoratorPattern.Depozite;
import FacadePattern.DepoziteBanca;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        out.println("Adapter Pattern..."); // Adapter Pattern...
        ObtineCredit credit = new DetaliiBanca("MobiasBanca", "Student", 753, 15);
        out.println(credit.obtineCredit());
        out.print("\n");

        out.println("Bridge Pattern..."); // Bridge Pattern...
        Valuta dolar = new Convertor(12, new ConvertDolar());
        Valuta euro = new Convertor(23, new ConvertEuro());
        dolar.afiseaza();
        euro.afiseaza();
        out.print("\n");

        out.println("Composite Pattern...");
        Angajat manager = new ManagerBanca(100, "MobiasBanca");
        Angajat angajat1 = new Creditor(101, "Moldincombank");
        Angajat angajat3 = new AngajatBanca(102, "AgroindBanc");
        manager.add(angajat1);
        manager.add(angajat3);
        manager.print();
        out.print("\n");

        out.println("Decorator Pattern..."); // Decorator Pattern...
        CompBanca compBanca = new Credite(new Depozite(new DenBanca()));
        out.println(compBanca.InfoBanca());
        out.print("\n");

        out.println("Facade Pattern... "); // Facade Pattern...
        DepoziteBanca depoziteBanca = new DepoziteBanca();
        out.println(depoziteBanca.informJazz());
        out.println(depoziteBanca.informSonata());
        out.println(depoziteBanca.informTango());
        out.print("\n");




    }
}

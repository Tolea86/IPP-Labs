import CommandPattern.*;
import CommandPattern.TV;
import IteratorPattern.Iterator;
import IteratorPattern.NameRepository;
import MediatorPattern.TVClass1;
import MediatorPattern.TVClass2;
import MediatorPattern.ConcreteMediator;
import StrategyPattern.RemoteDevice;
import StrategyPattern.TVPost1;
import StrategyPattern.TVPost2;
import StrategyPattern.TVPost3;
import VisitorPattern.*;


public class Main {
    public static void main(String[] args) {
        System.out.println("Command Pattern... "); // CommnadPattern
        TV tv = new TV();
        Command connectCommand = new IsConnecting(tv);
        Command disconnectCommand = new IsNotConnecting(tv);
        Switch tvSwitching = new Switch(connectCommand, disconnectCommand);
        tvSwitching.Connect();
        tvSwitching.Disconnect();
        System.out.print("\n");
        /********************************************************************************/
        System.out.println("Iterator Pattern...");  //IteratorPattern
        NameRepository nameRepository = new NameRepository();
        System.out.print("TV Marca: ");
        for (Iterator iterator = nameRepository.getIterator(); iterator.hasNext();) {
            String name = (String) iterator.next();
            if (!iterator.hasNext()) {
                System.out.print(name);
            } else {
                System.out.print(name + ", ");
            }
        }
        System.out.println("\n");
        /********************************************************************************/
        System.out.println("Mediator Pattern... ");  // Mediator Pattern
        ConcreteMediator m = new ConcreteMediator();
        TVClass1 c1 = new TVClass1(m);
        TVClass2 c2 = new TVClass2(m);
        m.settvClass1(c1);
        m.settvClass2(c2);
        c1.send(" JurnalTV");
        c2.send(" ProTV");
        System.out.print("\n");
        /********************************************************************************/
        System.out.println("Strategy pattern...");  //Strategy pattern
        RemoteDevice remoteDevice = new RemoteDevice(new TVPost1());
        System.out.println("TV prezinta: " + remoteDevice.executeStrategy(1));
        remoteDevice = new RemoteDevice(new TVPost2());
        System.out.println("TV prezinta: " + remoteDevice.executeStrategy(2));
        remoteDevice = new RemoteDevice(new TVPost3());
        System.out.println("TV prezinta: " + remoteDevice.executeStrategy(3));
        System.out.print("\n");
        /********************************************************************************/
        System.out.println("Visitor Pattern...");   //Visitor Pattern
        TvAttachment attachment = new VisitorPattern.TV();
        attachment.accept(new ShowTvComp());
    }
}

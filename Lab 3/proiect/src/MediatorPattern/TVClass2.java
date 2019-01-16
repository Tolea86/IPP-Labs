package MediatorPattern;

public class TVClass2 extends TVClass {

    public TVClass2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("TV 2 prezinta: " + message);
    }
}

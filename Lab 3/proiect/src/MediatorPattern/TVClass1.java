package MediatorPattern;

public class TVClass1  extends TVClass {

    public TVClass1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(String message) {
        System.out.println("TV 1 prezinta: " + message);
    }
}

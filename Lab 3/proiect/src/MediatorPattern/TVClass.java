package MediatorPattern;

public abstract class TVClass {
    protected Mediator mediator;
    public TVClass(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(String message) {
        mediator.send(message, this);
    }

    public abstract void notify(String message);
}

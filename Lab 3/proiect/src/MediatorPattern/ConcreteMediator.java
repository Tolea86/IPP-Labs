package MediatorPattern;

public class ConcreteMediator extends Mediator {
    private TVClass1 tvClass1;
    private TVClass2 tvClass2;

    public void settvClass1(TVClass1 tvClass1) {
        this.tvClass1 = tvClass1;
    }

    public void settvClass2(TVClass2 tvClass2) {
        this.tvClass2 = tvClass2;
    }

    @Override
    public void send(String message, TVClass tvClass) {
        if (tvClass.equals(tvClass2)) {
            tvClass1.notify(message);
        } else {
            tvClass2.notify(message);
        }
    }
}

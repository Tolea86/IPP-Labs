package AbstractFactory;

public class Apple implements Producator {
    iPhone _iphone;
    iPhonePlus _iphonePlus;
    @Override
    public void ProduceTelefon() {
        _iphone =  new iPhone();
        _iphonePlus =  new iPhonePlus();
    }
}

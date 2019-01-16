package AbstractFactory;

public class Google implements  Producator {
    GooglePixel _pixel;
    GooglePixelXL _pixelxl;
    @Override
    public void ProduceTelefon() {
         _pixel= new GooglePixel();
         _pixelxl = new GooglePixelXL();
    }
}

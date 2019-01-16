package FactoryMethod;

public class GoogleFM {
        public IPixel ConstruiestePixel(String tip){
            IPixel Pixel;
            if (tip=="Pixel"){
                Pixel=new Pixel();
            }
            else{
                Pixel=new PixelXL();
            }
       return Pixel;
    }
}

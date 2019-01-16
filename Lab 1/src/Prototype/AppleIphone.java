package Prototype;

public class AppleIphone implements Cloneable{
    public String Denumire;


    public Object clone() {
        Object Copy = null;
        try
        {
            Copy = super.clone() ;
        }catch (CloneNotSupportedException e)
        {
        }return Copy;
    }
}

package Singleton;

public final class GoogleSingleton {
    private static GoogleSingleton instance;
    private static final Object acces = new Object();

    GoogleSingleton(){

    }
    public static GoogleSingleton GetInstance(){
        synchronized (acces){
            if (instance==null){
                instance = new GoogleSingleton();
                System.out.println("Google a fost creat");
            }
            else System.out.println("Deja exista o instanta Google");
            return instance;
        }
    }

}

package objectsandclasses;

public class Singleton {
    private static Singleton obj = null;
    private Singleton() {

    }

    public static Singleton getInstance() {
        if (obj == null) {
            obj = new Singleton();
        }
        return obj;
    }


    public static void displayMessage() {
        System.out.println("Hello world!");
    }

    public static void main(String[] args) {
        Singleton x = Singleton.getInstance();
        x.displayMessage();
    }
}

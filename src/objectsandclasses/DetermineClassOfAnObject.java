package objectsandclasses;

class Ashok {

}

public class DetermineClassOfAnObject {
    public static void main(String[] args) {
        Ashok a = new Ashok();
        System.out.println(a.getClass());
        System.out.println(a instanceof Ashok);
    }
}

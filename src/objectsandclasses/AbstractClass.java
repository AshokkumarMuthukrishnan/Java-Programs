package objectsandclasses;

abstract class Base {
    Base() {
        System.out.println("Hello world!");
    }
    void fun() {
        System.out.println("Hello java!");
    }
}

class Derived extends Base {
//    void fun() {
//        System.out.println("Hello java!");
//    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Derived test = new Derived();
        test.fun();
    }
}

package objectsandclasses;

public class ThisReference {
    int a = 5;
    int b = 10;

    ThisReference() {
        this(20, 30);
    }

    ThisReference(int a, int b) {
        this.a = 10;
        this.b = 5;
    }

    void display() {
        System.out.println("a + b = " + (a + b));
    }

    public static void main(String[] args) {
        ThisReference test = new ThisReference(20, 30);
        test.display();
    }
}

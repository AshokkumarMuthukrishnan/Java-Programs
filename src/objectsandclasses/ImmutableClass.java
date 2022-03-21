package objectsandclasses;

final class ImmutableTempClass {
    private final String name;
    private final int date;

    ImmutableTempClass(String name, int date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public int getDate() {
        return this.date;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {
        ImmutableTempClass obj = new ImmutableTempClass("Programiz", 2011);
        System.out.println("Name: " + obj.getName());
        System.out.println("Date: " + obj.getDate());
    }
}

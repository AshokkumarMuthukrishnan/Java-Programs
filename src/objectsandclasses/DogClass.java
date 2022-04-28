package objectsandclasses;

public class DogClass {
    String name;
    String breed;
    int age;
    String color;

    DogClass(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return("Hi my name is "+ getName()+
                ".\nMy breed,age and color are " +
                this.getBreed()+"," + this.getAge()+
                ","+ this.getColor());
    }

    public static void main(String[] args) {
        DogClass dog = new DogClass("tuffy","papillon", 5, "white");
        System.out.println(dog.toString());
    }
}

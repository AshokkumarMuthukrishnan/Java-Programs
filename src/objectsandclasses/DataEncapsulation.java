package objectsandclasses;

public class DataEncapsulation {
    private String name = "";
    private int age;
    private int registerNo;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getRegisterNo() {
        return registerNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRegisterNo(int registerNo) {
        this.registerNo = registerNo;
    }

    public static void main(String[] args) {
        DataEncapsulation obj = new DataEncapsulation();
        obj.setName("Ashokkumar");
        obj.setAge(26);
        obj.setRegisterNo(39450007);

        System.out.println("Student name: " + obj.getName());
        System.out.println("Student age: " + obj.getAge());
        System.out.println("Student register no: " + obj.getRegisterNo());
    }
}

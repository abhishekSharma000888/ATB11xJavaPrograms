package task;

public class Task16_PersonClass {

    public static void main(String[] args) {

        System.out.println(Person.getPhoneNumber());

        Person.personName();

        Person person1 = new Person();

        person1.height(5.10);
        System.out.println("Eye color: " + person1.eyesColor("Brown"));
    }
}

class Person {

    String name;
    byte age;
    double height;
    String location;
    String motherTongue;
    boolean isMarried;
    boolean isMale;
    String phoneNumber;
    boolean isRightHanded;
    String eyeColor;

    // Without parameter and without return type
    static void personName() {
        System.out.println("The name of the person is Abhishek");
    }

    // Without parameters but with return type
    static String getPhoneNumber() {
        return "7340001111";
    }

    // With parameters and without return type
    void height(double height) {
        System.out.println("The person's height is: " + height);
    }

    // With parameters and with return type
    String eyesColor(String eyeColor) {
        return eyeColor;
    }
}

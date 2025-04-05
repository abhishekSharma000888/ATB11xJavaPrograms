package task;

public class Task21_Person {

    private String name;

    public Task21_Person(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + name);
    }
}

class ATBLearner extends Task21_Person {  // Single inheritance
    private String course;

    public ATBLearner(String name, String course) {
        super(name);
        this.course = course;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Course: " + course);
    }
}

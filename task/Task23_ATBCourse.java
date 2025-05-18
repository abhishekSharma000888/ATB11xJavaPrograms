package task;

public class Task23_ATBCourse {
    protected String courseName;

    public Task23_ATBCourse(String courseName) {
        this.courseName = courseName;
    }

    public void showCourse() {
        System.out.println("Course: " + courseName);
    }
}

class ProgrammingCourse extends Task23_ATBCourse {  // Hierarchical inheritance
    private String language;

    public ProgrammingCourse(String courseName, String language) {
        super(courseName);
        this.language = language;
    }

    @Override
    public void showCourse() {
        super.showCourse();
        System.out.println("Programming Language: " + language);
    }
}

class FinanceCourse extends Task23_ATBCourse {  // Hierarchical inheritance
    private String specialization;

    public FinanceCourse(String courseName, String specialization) {
        super(courseName);
        this.specialization = specialization;
    }

    @Override
    public void showCourse() {
        super.showCourse();
        System.out.println("Specialization: " + specialization);
    }
}

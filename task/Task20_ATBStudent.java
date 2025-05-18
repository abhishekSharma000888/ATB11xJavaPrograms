package task;

public class Task20_ATBStudent {
    private String studentId;
    private String name;
    private String course;
    private double fee;

    // Constructor
    public Task20_ATBStudent(String studentId, String name, String course, double fee) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.fee = fee;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public double getFee() {
        return fee;
    }

    // Setters
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    // toString method
    @Override
    public String toString() {
        return "ATBStudent{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", fee=" + fee +
                '}';
    }
}

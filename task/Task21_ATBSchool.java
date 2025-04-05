package task;

import java.util.Arrays;

public class Task21_ATBSchool {
    public static void main(String[] args) {
        // Create array of ATBStudents
        Task20_ATBStudent[] students = new Task20_ATBStudent[3];

        // Add students to array
        students[0] = new Task20_ATBStudent("ATB001", "Alice", "Java Programming", 999.99);
        students[1] = new Task20_ATBStudent("ATB002", "Bob", "Python Fundamentals", 799.99);
        students[2] = new Task20_ATBStudent("ATB003", "Charlie", "Web Development", 899.99);

        // Print all students
        System.out.println("ATB Students:");
        for (Task20_ATBStudent student : students) {
            System.out.println(student); // Calls toString() automatically
        }

        // Alternative printing with Arrays.toString()
        System.out.println("\nUsing Arrays.toString():");
        System.out.println(Arrays.toString(students));
    }
}

package task;

import java.util.Scanner;

public class Task02 {

    String Name;

    float Salary;

    int age;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the name of the person: ");

        String Name = scanner.nextLine();

        System.out.println("Enter the Salary of the person: ");

        float Salary = scanner.nextFloat();

        System.out.println("Enter the age of the person: ");

        int age = scanner.nextInt();

        System.out.println("The name, age, salary of the person is: "+ Name + " " + age +" " + Salary);


    }
}

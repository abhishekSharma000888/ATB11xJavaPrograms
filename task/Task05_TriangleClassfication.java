package task;

import java.util.Scanner;

public class Task05_TriangleClassfication {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input for the side s1:");

        int s1 = sc.nextInt();

        System.out.println("Enter the input for the side s2:");

        int s2 = sc.nextInt();

        System.out.println("Enter the input for the side s3:");

        int s3 = sc.nextInt();

        if(s1 == s2 && s2 == s3){

            System.out.println("This is a equilateral triangle.");
        } else if (s1 == s2 || s1 == s3 || s2 == s3){

            System.out.println("This is an isosceles triangle.");
        } else{

            System.out.println("The triangle is scalene.");
        }

        sc.close();

    }

}

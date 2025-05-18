package task;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number");

        int num1 = scanner.nextInt();

        System.out.println("Enter the second number");

        int num2 = scanner.nextInt();


        String result = (num1>num2)? "Num 1 is greater than Num2" : "Num2 is greater than Num1";

        System.out.println(result);



    }
}

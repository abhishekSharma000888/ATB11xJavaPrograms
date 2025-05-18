package task;

import java.util.Scanner;

public class Task04_OddOrEven {

    public static void main(String[] args){

        //Even or Odd Number


        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number:");

        int a = scanner.nextInt();

        if(a%2 == 0){

            System.out.println("The user input is even");
        } else{

            System.out.println("The user input is odd");
        }
    }
}

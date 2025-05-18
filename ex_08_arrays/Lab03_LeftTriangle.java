package ex_08_arrays;

import java.util.Scanner;

public class Lab03_LeftTriangle {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number e.g n=3");

        int n = scanner.nextInt();

        for(int i=0; i<=n; i++){

            for(int j=0; j<=i; j++){

                System.out.print("*");
            }
            System.out.println();
        }


    }
}

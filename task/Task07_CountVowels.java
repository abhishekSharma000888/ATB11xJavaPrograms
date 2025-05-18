package task;

import java.util.Scanner;

public class Task07_CountVowels {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int count =0;

        System.out.println("Enter the input to count vowels:");

        String input = scanner.nextLine();

        for(int i=0; i< input.length(); i++){

            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i'
            || input.charAt(i) == 'o' || input.charAt(i) == 'u'){

                count ++;
            }

        }

        System.out.println(count);
    }
}

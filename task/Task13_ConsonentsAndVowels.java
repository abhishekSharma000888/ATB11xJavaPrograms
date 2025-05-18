package task;

import java.util.Scanner;

public class Task13_ConsonentsAndVowels {

    public static void main(String[] args){

        int vowels = 0;

        int consonents = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the input");

        String input = sc.nextLine();

        input = input.toLowerCase();

        for(int i=0; i<input.length(); i++){

            if(input.charAt(i)== 'a' || input.charAt(i)== 'a'|| input.charAt(i)== 'e'|| input.charAt(i)== 'i'||
            input.charAt(i)== 'o' || input.charAt(i)== 'u'){

                vowels = vowels + 1;
            } else {

                consonents = consonents + 1;
            }
        }
        System.out.println("vowels: "+ vowels);
        System.out.println("consonents: "+ consonents);
    }
}

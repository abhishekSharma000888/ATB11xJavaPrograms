package ex_05_increment_decrement;

public class Lab01_Increment_Decrement {

    public static void main(String[] args){

        // pre increment example

        // the value is first incremented and then stored in the result.

        int a = 1;

        int b= ++a ;

        System.out.println(b);

        System.out.println(a);

        int c = 10;

        System.out.println("Printing after applying increment "+ (c++));

        System.out.println( (c++));
    }
}

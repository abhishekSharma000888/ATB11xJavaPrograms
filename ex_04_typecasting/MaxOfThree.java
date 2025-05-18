package ex_04_typecasting;

public class MaxOfThree {

    public static void main(String[] args){

        int a = 17;

        int b = 12;

        int c = 89;

        String result = (a > b) ? ((a> c) ? "A is max" : "C is max") : "B is max";

        System.out.println("The maximum of 3 numbers is: "+ result);
    }
}

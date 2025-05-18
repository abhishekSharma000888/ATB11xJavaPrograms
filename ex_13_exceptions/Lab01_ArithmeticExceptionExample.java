package ex_13_exceptions;

public class Lab01_ArithmeticExceptionExample {

    public static void main(String[] args){

        int a = 0;

        int b = 20;

        try{
                int result = b/a;
        } catch(ArithmeticException e){

            System.out.println("Divisibility by zero is not possible!");
        }

    }
}

package ex_13_exceptions;

public class Lab03_ArithmeticAndNullpointerExceptionException {

    public static void main(String[] args){

        String s1 = null;



        try{
            int k =10/0;
            s1.trim();
        } catch(ArithmeticException | NullPointerException e){

            System.out.println("Error!");
        }
    }
}

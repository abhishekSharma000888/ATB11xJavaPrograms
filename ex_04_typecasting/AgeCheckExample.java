package ex_04_typecasting;

public class AgeCheckExample {

    public static void main(String[] args){

        int age = 23;

        String result = (age> 18)? ((age> 65)? "The person is senior citizen" : "The person is adult") : "The person is minor";

        System.out.println("The result is: "+ result);
    }
}

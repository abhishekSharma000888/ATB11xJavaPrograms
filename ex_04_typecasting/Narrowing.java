package ex_04_typecasting;

public class Narrowing {

    public static void main(String[] args){

        int a = 1000;

        byte b = (byte)a; // Explicit type casting which result into data loss.

        System.out.println(b);
    }
}

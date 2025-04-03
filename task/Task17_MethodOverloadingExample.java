package task;

public class Task17_MethodOverloadingExample {


    int add(int a, int b){

        return a+b;
    }

    double add(double a, double b){

        return a+b;
    }


    public static void main(String[] args){

        Task17_MethodOverloadingExample example = new Task17_MethodOverloadingExample();

        int a = 5;

        int b =10;

        // Calling the int version
        int sum1 = example.add(5, 10);
        System.out.println("Sum of integers: " + sum1);

        // Calling the double version
        double sum2 = example.add(5.5, 10.5);
        System.out.println("Sum of doubles: " + sum2);

    }
}

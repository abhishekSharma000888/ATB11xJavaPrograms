package task.whileLoop;

public class Task32_FirstTenNaturalNumbers {

    public static void main(String[] args){

        int sum = 0;

        int i =1 ;

        int limit = 10;

        while(i <= limit){

            sum += i;

            i++;
        }

        System.out.println(sum);
    }
}

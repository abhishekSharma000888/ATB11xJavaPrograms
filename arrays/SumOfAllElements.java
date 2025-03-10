package arrays;

public class SumOfAllElements {
    public static void main(String[] args){

        int[] arr1 =  {1,2,3,4,5,6,7,0};

        int sum =0;

        for(int i=0; i< arr1.length; i++){

            sum = sum + arr1[i];

        }

        System.out.println("The sum of all the integers is:" + sum);

    }
}

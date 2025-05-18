package arrays;

public class AverageOfAllTheElements {

    public static void main(String[] args){

        int[] arr1 =  {1,2,3,4,5,6,7,0};

        int sum =0;

        double average;

        for(int i=0; i< arr1.length; i++){

            sum = sum + arr1[i];


        }

        average = sum/arr1.length;

        System.out.println("The sum of all the integers is:" + sum);

        System.out.println("The average of all the integers is:" + average);

    }
}

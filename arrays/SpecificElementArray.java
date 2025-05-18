package arrays;

public class SpecificElementArray {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 0};

        int check = 90;


        /** checking by iterating over the array
         *
         */
        boolean found = false;

        for(int num : arr1){

            if(num == check){

                found = true;
                break;
            }
        }
        if(found){

            System.out.println("The element exists"+ check);
        } else{
            System.out.println("The element doesnot exists "+ check);

        }


        }


        }




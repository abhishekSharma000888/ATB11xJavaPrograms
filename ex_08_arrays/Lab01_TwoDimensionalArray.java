package ex_08_arrays;

public class Lab01_TwoDimensionalArray {

    public static void main(String[] args){

        int[][] arr= new int[2] [2];

        arr[0][0] = 1;
        arr[0][1] = 2;

        arr[1][0] =3;
        arr[1][1] = 4;

        for (int i = 0; i < arr.length; i++) {  // Correct outer loop

            for (int j = 0; j < arr[i].length; j++) {  // Fixed inner loop condition

                System.out.print(arr[i][j] +" | ");  // Print the array elements
            }

            System.out.println();
        }
    }
}

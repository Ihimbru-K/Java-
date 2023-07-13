import java.util.Arrays;

public class Array {
    public static void main(String[] args){

        int[] integers = {1,2,3,4,5,6,7};  // initializing an array of 7 integers

        final int c = integers.length; //getting the length of the array and displaying it
        System.out.println(c);

        for(int i = 0; i <= integers.length-1; i++){
            System.out.println(integers[i]);        //looping through and printing all elements of the array
        }

        int[] integers2 = new int[7];  // declaring an empty array of 7 indices

        for(int k = 0; k < integers2.length; k++){  // looping through the first and second arrays and storing the content of the first in the seconed
            integers2[k] = integers[k];
        }

        for(int l = 0; l < integers2.length; l++){
            System.out.println(integers2[l] + ""); //1,2,3,4,5,6,7
        }
    }
}
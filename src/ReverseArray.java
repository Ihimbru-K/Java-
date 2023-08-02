import java.util.Arrays;

public class ReverseArray {

    //a method called reverseArray takes an array of integers
    /* int[] arr, scans through it beginning from the last element
    to the first (in reverse order) and stores every element in a new
    array called revArr then prints it out
    * */
    public static int[] reverseArray(int[] arr){

        int length = arr.length;
        int[] revArr = new int[length];

        for(int i = length-1, j = 0; i >= 0; i--, j++  ){

            revArr[j] = arr[i];
        }
        return revArr;

    }




    public static void main(String[] args){
        int[] myArray = {1,2,3,4,5,6,7};
        int[] revArray = reverseArray(myArray);
        System.out.println(Arrays.toString(revArray));

    }

}

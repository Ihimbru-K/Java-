public class ForLoop {

    // Method to calculate sum of elements in an array of doubles
    public static double SumArray(double[] arr){
        double sum = 0;

        // Loop through each element in the array and add it to the sum
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }

        // Return the final sum
        return sum;
    }

    // Method to find the maximum element in an array of doubles
    public static double max(double[] arr){
        double max = arr[0];

        // Loop through each element in the array and compare it to the current maximum
        for(int j = 0; j< arr.length; j++){
            if( max < arr[j]){
                max = arr[j];
            }
        }

        // Return the final maximum value
        return max;
    }

    // Main method to run the program
    public static void main(String[] args){

        // Calculate the sum of elements in an array and print the result to the console
        System.out.println("Sum of elements of array is " + SumArray(new double[]{1.0, 2.4, 2.5}));

        // Find the maximum element in an array and print the result to the console
        System.out.println("Max element of array is " + max(new double[]{1.4, 33.5, 49.6}));
    }
}
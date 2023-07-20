public class SumOfSquaresLessThanN {

    // This method takes an integer n and returns the sum of squares of all positive integers less than or equal to n.
    public static int SumOfSquares(int n){
        int sum = 0;
        // Use a for loop to iterate from 1 to n (inclusive)
        for(int i = 1; i<=n; i++){
            // At each iteration, add the square of i to the sum variable
            sum += Math.pow(i, 2);
        }
        // Return the sum of squares
        return sum;
    }

    public static void main(String[] args){
        // Call the SumOfSquares method with an argument of 24 and print the result to the console
        System.out.println("Sum of squares of positive integers less than or equal to 24 is: " + SumOfSquares(24));
    }
}
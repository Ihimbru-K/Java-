public class SumOfIntegersLessThanN {

    // Declare a static variable called sum to store the sum of integers
    static int sum = 0;

    // This method takes an integer n and returns the sum of all integers less than or equal to n
    public static int SumOfInt(int n){
        // Use a for loop to iterate from 1 to n (inclusive)
        for(int i = 1; i<=n; i++){
            // At each iteration, add i to the sum variable
            sum += i;
        }
        // Return the sum of integers
        return sum;
    }

    // This method takes an integer k and returns the sum of all odd integers less than or equal to k
    public static int SumOfOdd(int k){
        // Declare a variable called sum2 to store the sum of odd integers
        int sum2 = 0;
        // Use a for loop to iterate from 1 to k (inclusive)
        for(int j = 1; j<=k; j++){
            // At each iteration, check if j is odd, and if it is, add j to the sum2 variable
            if(j % 2 != 0){
                sum2 += j;
            }
        }
        // Return the sum of odd integers
        return sum2;
    }

    public static void main (String[] args){
        // Call the SumOfInt method with an argument of 10 and print the result to the console
        System.out.println(SumOfInt(10));
        // Call the SumOfOdd method with an argument of 10 and print the result to the console
        System.out.println(SumOfOdd(10));
    }
}
public class WhileStatement {
    // Define an array of integers
    static int[] numbers = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
    // Store the length of the array in a constant variable
    final static int c = numbers.length;

    public static void main(String[] args) {
        // Initialize a variable to use as an index
        int j = 0;
        // Loop through the array while the index is less than the length
        while (j < c) {
            // Print the value of the element at the current index
            System.out.println(numbers[j]);
            // Increment the index by 1
            j++;
        }
    }
}
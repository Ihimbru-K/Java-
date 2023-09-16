public class Fibonacci {

    public static String fibonacci(int count) {
        if (count <= 0) {
            return "Invalid input. Count must be a positive integer.";
        }

        if (count == 1) {
            return "0";
        }

        if (count == 2) {
            return "0, 1";
        }

        StringBuilder fibonacciSequence = new StringBuilder();
        fibonacciSequence.append("0, 1");

        int firstNum = 0;
        int secondNum = 1;

        for (int i = 2; i < count; i++) {
            int c = firstNum + secondNum;
            fibonacciSequence.append(", ").append(c);

            firstNum = secondNum;
            secondNum = c;
        }

        return fibonacciSequence.toString();
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(10));
    }
}
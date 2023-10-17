
public class FirstHundredPrimeNumbers {
    public static void FirstHundredPrime() {
        int count = 0; // Variable to keep track of the number of prime numbers found
        int number = 2; // Starting number to check for primality

        while (count < 100) {
            boolean isPrime = true;

            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
                count++;
            }

            number++;
        }
    }
    public static void main(String[]args){

        FirstHundredPrime();

    }

}
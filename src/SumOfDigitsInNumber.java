public class SumOfDigitsInNumber {

    public static int sumOfDigitsInNum(int num) {
        int storeBrokenDigitSum = 0;
        while (num > 0) {

            storeBrokenDigitSum += num % 10;
            num /= 10;
        }
        return storeBrokenDigitSum;
    }

    public static void main(String[] Args){
        int num = 4444;
        System.out.println("Sum of integers in 40 is "+sumOfDigitsInNum(num));

    }
}

import org.jetbrains.annotations.NotNull;

public class AverageOfNumbersInArray {

    public static double ArrayAvg(int @NotNull [] arr) {
        final int n = arr.length;
        int sum = 0;
        double avg = 0;
        for (int i : arr
        ) {
            sum += i;
            avg = (double) sum / n;
        }
        return avg;
    }

    public static void main(String[] args){
        int[] testArr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("average of elements of array is "+ ArrayAvg(testArr));
    }




}

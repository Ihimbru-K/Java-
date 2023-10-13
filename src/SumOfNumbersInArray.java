import java.util.List;

public class SumOfNumbersInArray {


    public static int SumArray(int[] Array){
        int sum = 0;
        for(int i : Array){
            sum += i;
        }
        return sum;
    }

    public static int SumNumInArray(int[] arr){
        int sum = 0;
        for (int i: arr
             ) {
            sum += i;
        }
        return sum;
    }






    public static void main(String[] args){
        int[] myArray = {1,2,3,4};
        System.out.println(SumNumInArray(myArray));

        int[] testArray = {1,2,3,4,5,6,7,8,9,10};

        System.out.println(SumArray(testArray));




    }
}

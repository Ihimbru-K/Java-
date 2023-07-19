public class ForLoop {
    public static double SumArray(double[] arr){
        double sum = 0;

        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum;

    }

    public static void main(String[] args){

        System.out.println("Sum of elements of array is " + SumArray(new double[]{1.0, 2.4, 2.5}));

    }


}

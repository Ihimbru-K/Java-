package data_structures;

public class MaxNumInArray {

    public static int MaxNum(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                max = arr[i];
            }
            max = arr[i + 1];
        }
        return max;
    }

    public static void main(String[] args){
        int[] ArrInt = {1,2,333,4,455,55,22};
        System.out.println(MaxNum(ArrInt));

    }


}

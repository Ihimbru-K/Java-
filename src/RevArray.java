public class RevArray {

    public static void RevArr(int[] Arr){
        int i = 0;
        for(i = Arr.length-1; i >= 0; i-- )
            System.out.println(Arr[i]+" ");


    }

    public static void main(String[] args){
        RevArr(new int[]{1,2,3,4});

    }
}

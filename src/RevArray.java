public class RevArray {
    // Reverse the elements of the input array and print them to the console
    public static void RevArr(int[] Arr){
        int i = 0;
        for(i = Arr.length-1; i >= 0; i-- ) {
            System.out.println(Arr[i]+" ");
        }
    }

    // Test the RevArr method with an example input array
    public static void main(String[] args){
        RevArr(new int[]{1,2,3,4});
    }
}
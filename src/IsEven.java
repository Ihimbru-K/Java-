public class IsEven {

    public static boolean isEven(int i) {
        if ((i & 1) == 0) {
            return true; // i is even
        } else {
            return false; // i is odd
        }
    }

    public static void main(String[] args){
       System.out.println(isEven(2333)); 
    }
}

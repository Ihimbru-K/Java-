public class IsMultiple {
    // Check if n is a multiple of m
    public static boolean IsMultiple(long n, long m){
        if(n % m == 0){
            return true;
        }
        else {
            return false;
        }
    }

    // Test the IsMultiple method with sample inputs
    public static void main(String[] args){
        System.out.println(IsMultiple(1444567848484L, 1444222222L)); // Output: false
        System.out.println(IsMultiple(1444L, 1444L)); // Output: true
    }
}
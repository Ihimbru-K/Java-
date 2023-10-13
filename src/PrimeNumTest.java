public class PrimeNumTest {
// ex 16
    public static boolean PrimeTest(int num){
        if(num <= 1)
            return false;

        for (int i =2; i < Math.sqrt(num) ; i++) {
            if(num %i == 0){
                return false;
            }

        }
        return true;
    }

    public static void main(String args[]){

        System.out.println(PrimeTest(13));
    }




}

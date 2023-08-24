public class Factorial {
   public static void main(String[] args){
       int num = 10,fact = 1;

       for(int c = 1; c<= num; c++ ){

           fact = fact*c;
       }
       System.out.println(fact);
   }
}

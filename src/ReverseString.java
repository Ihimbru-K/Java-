import java.util.Scanner;

public class ReverseString {
//reading a string from standard input, and reversing it
       public static void main (String[] args){

           Scanner name = new Scanner(System.in);
           System.out.println("Enter your name ");
           String myName = name.next();


           String rev = "";
           for(int i = myName.length()-1; i >=0; i--){

               rev += myName.charAt(i);
           }
           System.out.println(rev);

           System.out.println("The reverse of the word 'programmer' is: " + RevString("programmer"));

       }


       //Using stringbuilder to reverse a string
       public static String RevString(String string){
           StringBuilder word = new StringBuilder(string);
           String reversedString = word.reverse().toString();
           return reversedString;
       }

}

import java.util.Scanner;

public class ReadingInputOutput {
    public static void main(String[] args){
        Scanner name = new Scanner(System.in);
        System.out.println("Enter your name");
        String myName = name.next();

        Scanner age = new Scanner(System.in);
        System.out.println("Enter your age");
        int myAge = age.nextInt();

        Scanner school = new Scanner(System.in);
        System.out.println("Enter your school");
        String mySchool = school.next();

        System.out.println(myName+" you are "+myAge+" years old" + "and you school in"+mySchool);
    }

}

import java.util.Scanner;

public class Calculator {





    public static void main (String[] args){

        Scanner number = new Scanner(System.in);
        System.out.println("Enter number");
        if(number.hasNextInt()){
            int var = number.nextInt();
        }
        else if (number.hasNextDouble()){
            Double var = number.nextDouble();
        }

        Scanner number2 = new Scanner(System.in);
        System.out.println("Enter second number");
        if(number.hasNextInt()){
            int var = number.nextInt();
        }
        else if(number2.hasNextDouble()){
            Double var = number2.nextDouble();
        }


        Scanner operator = new Scanner(System.in);
        System.out.println("Enter operator");
        String myOperator = operator.next();
        

        if(myOperator.equals("+")){
            System.out.println("Sum is " + number2+number);
        }


        switch (myOperator){
            case "+":
                System.out.println("Sum is" + number2+number);
                break;

        }
    }









}

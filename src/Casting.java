

public class Casting {
    public static void main(String[] args){

        /**
        * Casting is all about changing
        * the type, of a value to another data type
        * */

        double d = 3.5555;
        int d1 =  (int) d;  // converting d of type double to an integer and storing it in variable d1

        int i = 4;
        double i1 = (double) i; //casting i into a double i1


        String year = "2023";
        int y1 = Integer.parseInt(year);  //method used to convert string to integer
        final int add = y1 + 4;

        int n = -35;
        String str1 = Integer.toString(n); //converting integer to string
        final String add1 = str1 + "years";

        System.out.println(add);
        System.out.println(add1);






            System.out.println(d1);
            System.out.println(i1);

    }
}

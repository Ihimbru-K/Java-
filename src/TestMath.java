public class TestMath {
    public static void main(String[] args){


        Maths maths = new Maths();

        int sum = maths.add(14,15);
        float division = maths.div(17, 15);
        int product = maths.mult(16,2);

        boolean check = maths.isEven(5);
        System.out.println(check);

        System.out.println("sum of 14 and 15 is " + sum);
        System.out.println("Product of 16 and 2 is" + product);
        System.out.println("17 divided by 15 is" + division);
    }
}

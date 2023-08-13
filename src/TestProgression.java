public class TestProgression {
    public static void main(String[] args){
        Progression prog;
        System.out.print("Arithmetic progression with increment of 1 ");
        prog = new ArithmeticProgression();
        prog.PrintProgression(10);

        System.out.print("Arithmetic progression with step of 2 ");
        prog = new ArithmeticProgression(2);
        prog.PrintProgression(10);

        System.out.print("Arithmetic progression starting from 5 with increment of 2");
        prog = new ArithmeticProgression(2,5);
        prog.PrintProgression(10);


        System.out.print("Geometric progression starting from 2 with base 2");
        prog = new GeometricProgression(2,2);
        prog.PrintProgression(10);

        System.out.print("Default fibonacci sequence");
        prog = new FibonacciSequence();
        prog.PrintProgression(10);
        System.out.print("Fibonacci sequence starting with 1 ande 2");
        prog = new FibonacciSequence(1,2);
        prog.PrintProgression(10);





    }

}

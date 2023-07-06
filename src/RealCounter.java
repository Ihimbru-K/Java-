public class RealCounter {
    public static void main(String[] args) {

        /**
        * In Java, a new object is created by using the new operator followed by a call to
         *  a constructor for the desired class; a constructor is a method that always shares the
         *  same name as its class. The new operator returns a reference to the newly created
         *  instance; the returned reference is typically assigned to a variable for further use.
        * */

        Counter c;  // creating new counter variable c but not creating an instance
        c = new Counter();   // Constructing a new counter and assigning it to c (creating an instance of the counter variable c)
        c.incrementCounter();  // increments the value of the counter
        c.decrementCounter(2); //decrements the value of the counter by two
        int b = c.getCounter(); // retrieving the value of the counter (in this case -1) and assigning it to a variable b
        System.out.println(b); //displaying it (-1)

        Counter d = new Counter(5); //constructing a new counter variable with an initial value of 5 and assigning it to a variable d
        d.decrementCounter(3); // subtracting 3 from d i.e 5-3 = 2
        Counter e = d; //creating a new counter variable e and assigning d to it

        int temp = e.getCounter(); //assigning e to another instance variable temp (remember e stores d =2)
        System.out.println(temp); //displaying the value of temp = 2

    }
}

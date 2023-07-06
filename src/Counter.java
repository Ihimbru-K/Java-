public class Counter{
    private int counter;  //instance variable of type int
    public Counter(){}  //default constructor (count = 0)
    public Counter(int initial){counter = initial;}  //alternate constructor
    public int getCounter(){return counter;}  //accessor method (also know as getter; doesn't change anything )

    //update methods (setters; update the values of the variable)
    public void incrementCounter(){counter++;}
    public void decrementCounter(int delta){counter -= delta;}
    public void resetCounter(){counter = 0;}


}


public class FibonacciSequence extends Progression {
    protected long prev;

    public FibonacciSequence(){
        this(0,1);
    }


    public FibonacciSequence(long first, long second) {
        super(first);
        prev = second - first;
    }
    protected void Advance(){
         long temp=prev;
         prev=current;
         current+=temp;
         }
  }


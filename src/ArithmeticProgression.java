public class ArithmeticProgression extends Progression{
    protected long increment;
    public ArithmeticProgression(){
        this(1,0);
    }

    public ArithmeticProgression(long step){
        this(step, 0);
    }


    public ArithmeticProgression(long step, long start) {
        super(start);
        increment = step;
    }

    protected void Advance(){
        current += increment;
    }

}

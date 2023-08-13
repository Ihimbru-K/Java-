public class GeometricProgression extends Progression {
    protected long base;

    public GeometricProgression() {
        this(2, 1);
    }

    public GeometricProgression(long bse) {
        this(bse, 1);
    }

    public GeometricProgression(long bse, long start) {
        super(start);
        base = bse;
    }
    protected void Advance(){
        current *= base;
    }
}

public class GeometricProgression extends Progression {
    protected long base;

    public GeometricProgression() {
        this(2, 1); // Default constructor, sets base to 2 and initial value to 1
    }

    public GeometricProgression(long bse) {
        this(bse, 1); // Constructor with custom base value, initial value is set to 1
    }

    public GeometricProgression(long bse, long start) {
        super(start); // Constructor with custom base and start values, invokes the superclass constructor
        base = bse; // Assigns the provided base value to the base variable
    }

    // Advances the progression by multiplying the current value with the base
    protected void Advance() {
        current *= base;
    }
}
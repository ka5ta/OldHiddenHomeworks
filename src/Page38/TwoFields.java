package Page38;

public class TwoFields {
    double first;
    char second;

    public TwoFields(double first) {
        this.first = first;
    }

    public TwoFields(char second) {
        this.second = second;
    }

    public TwoFields(double first, char second) {
        this(first);
        this.second = second;
    }

    public TwoFields( char second, double first) {
        this(second);
        this.first = first;
    }
}

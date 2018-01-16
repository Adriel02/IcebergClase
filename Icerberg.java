package icerbergModel;

public class Icerberg {

    private final String origin;
    private final double initialVolume;
    private final String name;


    public Icerberg(String origin, double initialVolume, String name) {
        this.origin = origin;
        this.initialVolume = initialVolume;
        this.name = name;
    }

    public String getOrigin() {
        return origin;
    }

    public double getInitialVolume() {
        return initialVolume;
    }

    @Override
    public String toString() {
        return name;
    }
}

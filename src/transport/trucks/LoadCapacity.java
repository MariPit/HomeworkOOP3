package transport.trucks;

public enum LoadCapacity {
    N1(0.0f, 3.5f),
    N2(3.5f,12.0f),
    N3(12.0f,null)
    ;

    private final Float lowerBound;
    private final Float upperBound;

    LoadCapacity(Float lowerBound, Float upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public float getLowerBound() {
        return lowerBound;
    }

    public float getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        if (upperBound != null) {
            return "Грузоподъемность от " + lowerBound + " тонн до " + upperBound + " тонн";
        } else {
            return "Грузоподъемность от " + lowerBound + " тонн";
        }
    }
}

package transport.bus;

public enum Capacity {
    XS(null, 10),
    S(null, 25),
    M(40, 50),
    L(60, 80),
    XL(100, 120);

    private Integer lowerBound;
    private Integer upperBound;

    Capacity(Integer lowerBound, Integer upperBound) {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public Integer getLowerBound() {
        return lowerBound;
    }

    public Integer getUpperBound() {
        return upperBound;
    }

    @Override
    public String toString() {
        if (lowerBound == null) {
            return "Вместимость до " + upperBound + " мест";
        } else {
            return "Вместимость от " + lowerBound + " до " + upperBound + " мест";
        }
    }
}

package transtort;

public enum LoadCapacity {
    N1(0.0, 3.5),
    N2(3.5, 12.0),
    N3(12.0, null);

    public final Double from;
    public final Double to;

    LoadCapacity(Double from, Double to) {
        this.from = from;
        this.to = to;
    }

    public Double getFrom() {
        return from;
    }

    public Double getTo() {
        return to;
    }
}

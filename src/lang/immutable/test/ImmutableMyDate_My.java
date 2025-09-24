package lang.immutable.test;

public class ImmutableMyDate_My {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate_My(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

package lang.immutable.test;

public class ImmutableMyDateMain_My {

    public static void main(String[] args) {
        ImmutableMyDate_My date1 = new ImmutableMyDate_My(2024, 1, 1);
        ImmutableMyDate_My date2 = date1;
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);

        System.out.println("2025 -> date1");
        // date1.setYear(2025);
        date2 = new ImmutableMyDate_My(2025, 1, 1);
        System.out.println("date1 = " + date1);
        System.out.println("date2 = " + date2);
    }
}

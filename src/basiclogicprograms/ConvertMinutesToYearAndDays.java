package basiclogicprograms;

public class ConvertMinutesToYearAndDays {
    public static void main(String[] args) {
        double min = 3456789;
        long years = (long) min/(365*24*60);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

    }
}

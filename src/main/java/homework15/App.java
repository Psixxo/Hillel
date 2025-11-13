package main.java.homework15;

public class App {

    public static void main(String[] args) {

        WeeklyOffers advisor = new WeeklyOffersCons();
        DayWeek dayWeek = new DayWeek();
        advisor.advise(dayWeek.getCurrentDay());

        System.out.println("------------------------");
        System.out.println("Усi поради:");
            advisor.advise(Day.MONDAY);
            advisor.advise(Day.TUESDAY);
            advisor.advise(Day.WEDNESDAY);
            advisor.advise(Day.THURSDAY);
            advisor.advise(Day.FRIDAY);
            advisor.advise(Day.SATURDAY);
            advisor.advise(Day.SUNDAY);

    }
}

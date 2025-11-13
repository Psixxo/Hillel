package main.java.homework15;

public class WeeklyOffersCons implements WeeklyOffers {

    @Override
    public void advise(Day day) {

        String message;
        switch (day) {
            case MONDAY -> message = "Починай тиждень так, ніби тиждень буде успішним.";
            case TUESDAY -> message = "Сьогодні – найкращий день, щоб зробити те, що ви відкладали.";
            case WEDNESDAY -> message = "Робота над цілями – це робота над своїм майбутнім.";
            case THURSDAY -> message = "Не бійтеся робити крок назад, щоб подивитися на проблему під новим кутом.";
            case FRIDAY -> message = "Happy Friday!";
            case SATURDAY -> message = "Завітайте до Міського саду імені Шевченка.";
            case SUNDAY -> message = "Завітайте до Argentina Grill.";
            default -> message = "Unknown";

        }

        System.out.println("День тижня: " + day + " - " + message);
    }
}

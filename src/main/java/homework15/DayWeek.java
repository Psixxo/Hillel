package main.java.homework15;

import java.time.LocalDate;

public class DayWeek {

    public Day getCurrentDay() {

        LocalDate currentDate = LocalDate.now();
        return Day.valueOf(currentDate.getDayOfWeek().toString());
    }
}

package chapter08;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Ex8_8_1 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        TemporalAdjuster first = TemporalAdjusters.firstDayOfMonth();
        LocalDate firstDate = today.with(first);
        int wod = firstDate.getDayOfWeek().getValue();
        String space = "   ".repeat(wod);
        System.out.print(space);
        int originalMonth = firstDate.getMonthValue();
        while(true) {
            System.out.printf("%3d", firstDate.getDayOfMonth());
            if (firstDate.getDayOfWeek() == DayOfWeek.SATURDAY) System.out.println();
            firstDate = firstDate.plusDays(1);
            int month = firstDate.getMonthValue();
            if (originalMonth != month) break;
        }
    }
}

package time.test_my;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

// 시작 요일, 마지막 요일 구하기
public class TestAdjusters {

    public static void main(String[] args) {
        int year = 2024;
        int month = 1;

        // 코드 작성
        LocalDate localDate = LocalDate.of(year, month, 1);
        DayOfWeek firstDayOfWeek = localDate.with(TemporalAdjusters.firstDayOfMonth()).getDayOfWeek();
        DayOfWeek lastDayOfWeek = localDate.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        System.out.println("firstDayOfWeek = " + firstDayOfWeek);
        System.out.println("lastDayOfWeek = " + lastDayOfWeek);
    }
}

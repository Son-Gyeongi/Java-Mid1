package time.test_my;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.util.Scanner;

/*
달력 출력하기
- 입력 조건: 년도, 월
 */
public class TestCalendarPrinter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("년도를 입력하세요: ");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.print("월을 입력하세요: ");
        int month = scanner.nextInt();
        LocalDate inputDate = LocalDate.of(year, month, 1);
        LocalDate nextMonthDate = inputDate.minusDays(1);

        System.out.println(" Su Mo Tu We Th Fr Sa");
        DayOfWeek dayOfWeek = inputDate.getDayOfWeek();
        // 월1,화2,수3,목4,금5,토6,일7
        int firstDayOfWeek = dayOfWeek.get(ChronoField.DAY_OF_WEEK);
        int lastDayOfMonth = nextMonthDate.getDayOfMonth();

        // 1의 시작 요일 찾기
        for (int i = 0; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int i = 1; i <= lastDayOfMonth; i++) {
            if (firstDayOfWeek++ % 7 == 0) System.out.println();
            String day = 10 > i ? ("  " + i) : (" " + i);
            System.out.print(day);
        }
    }
}

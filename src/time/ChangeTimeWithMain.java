package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

// 날짜와 시간을 조작하는 with() 메서드에 대해 알아보자
public class ChangeTimeWithMain {

    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1,
                13, 30, 59);
        System.out.println("dt = " + dt);

        // with() - 불변일때, 새로운 걸 만들 때 사용
        LocalDateTime changeDt1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("changeDt1 = " + changeDt1);

        // 편의 메서드
        LocalDateTime changeDt2 = dt.withYear(2020);
        System.out.println("changeDt2 = " + changeDt2);

        // TemporalAdjuster 사용
        // 복잡하게 날짜 수정
        // 다음주 금요일로 수정
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("기준 날짜: " + dt);
        System.out.println("다음 금요일: " + with1);

        // 이번 달의 마지막 일요일
        LocalDateTime with2 = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("같은 달의 마지막 일요일 = " + with2);
    }
}

package time.test;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/*
디데이 구하기
- 시작 날짜와 목표 날짜를 입력해서 남은 기간과 디데이를 구해라
- 남은 기간: x년 x개월 x일 형식을 출력한다.
- 디데이: x일 남은 형식으로 출력한다.
 */
public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period period = Period.between(startDate, endDate);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate); // 사이의 '일' 구하기

        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + period.getYears() + "년 "
                + period.getMonths() + "개월 " + period.getDays() + "일");
        System.out.println("디데이: " + daysBetween + "일 남음");
    }
}

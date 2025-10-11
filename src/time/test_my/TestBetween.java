package time.test_my;

import java.time.LocalDate;
import java.time.Period;

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

        // 코드 작성
        Period betweenDate = Period.between(startDate, endDate);
        System.out.println("시작 날짜: " + startDate);
        System.out.println("목표 날짜: " + endDate);
        System.out.println("남은 기간: " + betweenDate.getYears() + "년 "
                + betweenDate.getMonths() + "개월 " + betweenDate.getDays() + "일");

        int startDayOfYear = startDate.getDayOfYear();
        int endDayOfYear = endDate.getDayOfYear();
        System.out.println("디데이: " + (endDayOfYear - startDayOfYear) + "일 남음");
    }
}

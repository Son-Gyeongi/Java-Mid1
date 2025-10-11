package time.test_my;

import java.time.LocalDateTime;

/*
날짜 더하기
- 2024년 1월 1일 0시 0분 0초에 1년 2개월 3일 4시간 후의 시각을 찾아라
 */
public class TestPlus {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2024, 1, 1,
                0, 0, 0);
        System.out.println("기준 시각: " + ldt1);

        LocalDateTime ldt2 = ldt1.plusYears(1);
        LocalDateTime ldt3 = ldt2.plusMonths(2);
        LocalDateTime ldt4 = ldt3.plusDays(3);
        LocalDateTime ldt5 = ldt4.plusHours(4);
        System.out.println("1년 2개월 3일 4시간 후의 시각: " + ldt5);
    }
}

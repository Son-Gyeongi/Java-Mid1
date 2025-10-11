package time.test_my;

import java.time.LocalDate;

/*
날짜 간격 반복 출력하기
- 2024년 1월 1일 부터 2주 간격으로 5번 반복하여 날짜를 출력하는 코드를 작성하세요.
 */
public class TestLoopPlus {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2024, 1, 1);
        for (int i = 1; i <= 5; i++) {
            System.out.println("날짜 "+i+": "+localDate);
            localDate = localDate.plusWeeks(2);
        }
    }
}

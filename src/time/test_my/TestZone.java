package time.test_my;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
국제 회의 시간
- 서울의 회의 시간은 2024년 1월 1일 오전 9시다.
  이때 런던, 뉴욕의 회의 시간을 구해라
 */
public class TestZone {

    public static void main(String[] args) {
        LocalDateTime ldt1 = LocalDateTime.of(2024, 1, 1,
                9, 0, 0);
        ZonedDateTime zdtSeoul = ZonedDateTime.of(ldt1, ZoneId.of("Asia/Seoul"));
        LocalDateTime ldt2 = LocalDateTime.of(2024, 1, 1,
                0, 0, 0);
        ZonedDateTime zdtLondon = ZonedDateTime.of(ldt2, ZoneId.of("Europe/London"));
        LocalDateTime ldt3 = LocalDateTime.of(2023, 12, 31,
                19, 0, 0);
        ZonedDateTime zdtNewYork = ZonedDateTime.of(ldt3, ZoneId.of("America/New_York"));
        System.out.println("서울의 회의 시간: " + zdtSeoul);
        System.out.println("런던의 회의 시간: " + zdtLondon);
        System.out.println("뉴욕의 회의 시간: " + zdtNewYork);
    }
}

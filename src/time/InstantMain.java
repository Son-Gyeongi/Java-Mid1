package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {

        // 생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now(); // TimeZone -> UTC 변환
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        // UTC 기준 - 1970년 1월 1일 0시 0분 0초 기준
        Instant epochStart = Instant.ofEpochSecond(0);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600); // 1시간, 60분 * 60초
        System.out.println("later = " + later);

        // 조회
        // Epoch 로부터 흐른 시간
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}

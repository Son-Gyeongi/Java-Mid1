package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

/*
OffsetDateTime은 LocalDateTime에 UTC 오프셋 정보인 ZoneOffset이 합쳐진 것
ZoneId가 없으면 일광 절약 시간제(서머타임)가 적용되지 않는다.
 */
public class OffsetDateTimeMain {

    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1,
                13, 30, 50);
        System.out.println("ldt = " + ldt);
        // 1시간 시간차를 준다.
        OffsetDateTime odt = OffsetDateTime.of(ldt, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}

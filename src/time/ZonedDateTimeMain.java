package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/*
ZonedDateTime은 LocalDateTime에 시간대 정보인 ZoneId가 합쳐진 것
ZoneId를 통해 타임존을 알면 일광 절약 시간제에 대한 정보도 알 수 있다,
따라서 일광 절약 시간제가 적용된다.
 */
public class ZonedDateTimeMain {

    public static void main(String[] args) {
        ZonedDateTime nowZdt = ZonedDateTime.now();
        System.out.println("nowZdt = " + nowZdt);

        LocalDateTime ldt = LocalDateTime.of(2030, 1, 1,
                13, 30, 50);
        ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        System.out.println("zdt1 = " + zdt1);

        ZonedDateTime zdt2 = ZonedDateTime.of(2030, 1, 1,
                13, 30, 50, 0,
                ZoneId.of("Asia/Seoul"));
        System.out.println("zdt2 = " + zdt2);

        // zone 변경 가능, 한국 시간 -> 영국 시간(국제시간 확인 가능)
        ZonedDateTime utc2dt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
        System.out.println("utc2dt = " + utc2dt);
    }
}

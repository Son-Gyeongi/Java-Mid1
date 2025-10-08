package time;

import java.time.ZoneId;
import java.util.Set;

// 자바는 타임존을 ZoneId 클래스로 제공
public class ZoneIdMain {

    public static void main(String[] args) {
        // 이용 가능한 ZoneId에 대한 정보를 얻을 수 있다.
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            // System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        // 현재 내 운영체제가 가지고 있는 Zone 기반
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneId = " + seoulZoneId);
    }
}

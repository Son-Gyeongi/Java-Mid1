package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

// 모든 시간 필드 조회 가능여부 확인
public class IsSupportedMain2 {

    public static void main(String[] args) {
        // LocalDate는 년월일만 존재
        LocalDate now = LocalDate.now();

        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 시분초 꺼내기
            System.out.println("minute = " + minute);
        }
    }
}

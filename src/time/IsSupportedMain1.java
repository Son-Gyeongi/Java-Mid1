package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

// 모든 시간 필드를 다 조회할 수 있는 것은 아니다.
public class IsSupportedMain1 {

    public static void main(String[] args) {
        // LocalDate는 년월일만 존재
        LocalDate now = LocalDate.now();
        int minute = now.get(ChronoField.SECOND_OF_MINUTE); // 시분초 꺼내기
        System.out.println("minute = " + minute);
    }
}

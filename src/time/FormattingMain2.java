package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
문자열을 날짜와 시간으로 파싱
 */
public class FormattingMain2 {

    public static void main(String[] args) {
        // 포맷팅: 날짜와 시간을 문자로 변경
        LocalDateTime now = LocalDateTime.of(2024, 12, 31,
                13, 30, 59);
        DateTimeFormatter formatter = DateTimeFormatter
                .ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println("날짜와 시간 포맷팅 = " + formattedDateTime);
        System.out.println(now); // 세계 국제 표준 포맷

        // 파싱: 문자를 날짜와 시간으로 변경
        String dateTimeString = "2030-01-01 11:30:00"; // formatter 모양과 같아야 한다.
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println("문자열 파싱 날짜와 시간: " + parsedDateTime); // 세계 국제 표준으로 출력
    }
}

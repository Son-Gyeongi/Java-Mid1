package lang.string.method;

// String 클래스 주요 메서드 - 기타 유틸리티
public class StringUtilsMain2 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        // format 메서드
        String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
        System.out.println(format1);

        String format2 = String.format("숫자: %.2f", 10.1234);// 소수점 둘째자리까지 출력
        System.out.println(format2);

        // printf
        System.out.printf("숫자: %.3f\n", 10.1234);

        // matches 메서드 - regular expression 정규표현식은 필요하면 따로 공부하면 됨
        // "Hello, Java!"
        String regex = "Hello, (Java!|World)"; // Java나 World 둘 중에 하나가 들어오면 true
        System.out.println("'str' 이 패턴과 일치하는가? " + str.matches(regex));
    }
}

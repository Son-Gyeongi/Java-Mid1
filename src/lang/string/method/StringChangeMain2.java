package lang.string.method;

// String 클래스 주요 메서드 - 문자열 조작 및 변환
public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWithSpaces = "    Java Programming  ";

        System.out.println("소문자로 변환: " + strWithSpaces.toLowerCase());
        System.out.println("대문자로 변환: " + strWithSpaces.toUpperCase());

        // strip - 공백(whitespace) 제거
        System.out.println("공백 제거(trim): '" + strWithSpaces.trim() + "'");
        // strip - 공백(whitespace), 유니코드 공백 포함해서 제거 [자바 11부터 제공]
        System.out.println("공백 제거(strip): '" + strWithSpaces.strip() + "'");
        System.out.println("앞 공백 제거(stripLeading): '" + strWithSpaces.stripLeading() + "'");
        System.out.println("뒤 공백 제거(stripTrailing): '" + strWithSpaces.stripTrailing() + "'");
    }
}

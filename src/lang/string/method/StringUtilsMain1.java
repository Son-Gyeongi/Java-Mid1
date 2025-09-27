package lang.string.method;

// String 클래스 주요 메서드 - 기타 유틸리티
public class StringUtilsMain1 {

    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";

        // valueOf 메서드
        String numString = String.valueOf(num); // 숫자를 -> 문자열로
        System.out.println("숫자의 문자열 값: " + numString);
        String boolString = String.valueOf(bool); // 불리언을 -> 문자열로
        System.out.println("불리언의 문자열 값: " + boolString);
        String objString = String.valueOf(obj); // 객체를 -> 문자열로
        System.out.println("객체의 문자열 값: " + objString);

        // 문자 + x -> 문자
        String numString2 = "" + num; // 100 -> "100"
        System.out.println("빈문자열 + num: " + numString2);

        // toCharArray 메서드
        char[] strCharArray = str.toCharArray();
        System.out.println("문자열을 문자 배열로 변환: "+strCharArray);
        for (char c : strCharArray) {
            System.out.print(c);
        }
        System.out.println();
    }
}

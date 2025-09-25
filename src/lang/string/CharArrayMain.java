package lang.string;

// 자바에서 문자를 다루는 대표적인 타입은 char, String 2가지가 있다.
public class CharArrayMain {

    public static void main(String[] args) {
        // 기본형 char 문자 하나를 다룰 때 사용
        char[] charArr = new char[]{'h', 'e', 'l', 'l', 'o'}; // 여러 문자 나열
        System.out.println(charArr);

        // 문자열을 매우 편리하게 다룰 수 있는 String 클래스
        String str = "hello";
        System.out.println("str = " + str);
    }
}

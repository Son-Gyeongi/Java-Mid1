package lang.string;

// String 클래스를 통해 문자열을 생성하는 방법 2가지
public class StringBasicMain {

    public static void main(String[] args) {
        String str1 = "hello"; // 쌍따옴표 사용
        String str2 = new String("hello"); // 객체 생성

        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}

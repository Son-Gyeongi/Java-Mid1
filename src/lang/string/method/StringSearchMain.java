package lang.string.method;

// String 클래스 주요 메서드 - 문자열 검색
public class StringSearchMain {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java world.";

        System.out.println("문자열에 'Java' 가 포함되어 있는지: " + str.contains("Java"));
        System.out.println("'Java' 의 첫 번째 인덱스: " + str.indexOf("Java"));
        System.out.println("인덱스 10부터 'Java'의 인덱스 찾기: " + str.indexOf("Java", 10));
        System.out.println("'Java' 의 마지막 인덱스: " + str.lastIndexOf("Java"));
    }
}

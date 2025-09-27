package lang.string.method;

// String 클래스 주요 메서드 - 문자열 조작 및 변환
public class StringChangeMain1 {

    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";

        System.out.println("인덱스 7부터 부분 문자열: " + str.substring(7));
        System.out.println("인덱스 7부터 12(포함 안함)까지의 부분 문자열: " + str.substring(7, 12));

        System.out.println("문자열 결합: " + str.concat("!!!"));

        System.out.println("'Java' 를 'World' 로 대체: " + str.replace("Java", "World"));
        System.out.println("첫 번째 'Java' 를 'World' 로 대체: " + str.replaceFirst("Java", "World"));
    }
}

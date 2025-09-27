package lang.string.builder;

/*
StringBuilder
- 메모리 사용 줄이고 성능 향상 가능, 사이드 이펙트 주의
- 보통 문자열을 변경하는 동안만 사용하다가
  문자열 변경이 끝나면 안전한(불변) String 으로 변환하는 것이 좋다.
 */
public class StringBuilderMain1_1 {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);

        sb.insert(4, "Java"); // 인덱스 4에 Java 추가
        System.out.println("insert = " + sb);

        sb.delete(4, 8);
        System.out.println("delete = " + sb);

        sb.reverse(); // 문자열 뒤집기
        System.out.println("reverse = " + sb);

        // StringBuilder(가변) -> String(불변)
        String string = sb.toString();
        System.out.println("string = " + string);
    }
}

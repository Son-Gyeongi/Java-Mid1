package lang.string.test_my;

// split()
public class TestString9 {

    public static void main(String[] args) {
        String email = "hello@example.com";
        // 코드 작성
        String[] strArr = email.split("@");
        for (String s : strArr) {
            System.out.println(s);
        }
    }
}

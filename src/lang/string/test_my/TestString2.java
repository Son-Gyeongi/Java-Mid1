package lang.string.test_my;

// length()
public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        // 코드 작성
        int sum = 0;
        for (String string : arr) {
            int length = string.length();
            sum += length;
            System.out.println(string + ":" + length);
        }
        System.out.println("sum = " + sum);
    }
}

package lang.wrapper.test_my;

// parseInt()
// 문자로 입력된 두 수의 합
public class WrapperTest1 {
    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        // 코드 작성
        int sum = Integer.parseInt(str1) + Integer.parseInt(str2);
        System.out.println("두 수의 합: " + sum);
    }
}

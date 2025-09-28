package lang.string.test_my;

// 검색 count - indexOf()
public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 코드 작성
        int strIndex = str.indexOf(key, 0);
        int count = 0;
        while ((strIndex = str.indexOf(key, strIndex)) != -1) {
            count++;
            strIndex += key.length();
        }
        System.out.println("count = " + count);
    }
}

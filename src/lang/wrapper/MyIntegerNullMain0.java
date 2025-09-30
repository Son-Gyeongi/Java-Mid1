package lang.wrapper;

/*
기본형과 null
기본형은 항상 값을 가져야 한다.
하지만 때로는 데이터가 '없음'이라는 상태가 필요하다.
 */
public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}

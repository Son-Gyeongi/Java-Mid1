package lang.wrapper;

/*
객체의 경우 데이터가 없다는 null 이라는 명확한 값이 존재한다.
 */
public class MyIntegerNullMain1 {

    public static void main(String[] args) {
        MyInteger[] intArr = {
                new MyInteger(-1),
                new MyInteger(0),
                new MyInteger(1),
        };
        System.out.println(findValue(intArr, -1));
        System.out.println(findValue(intArr, 0));
        System.out.println(findValue(intArr, 1));
        System.out.println(findValue(intArr, 100));
    }

    private static MyInteger findValue(MyInteger[] intArr, int target) {
        for (MyInteger myInteger : intArr) {
            if (myInteger.getValue() == target) {
                return myInteger;
            }
        }
        return null; // 값이 없음
    }
}

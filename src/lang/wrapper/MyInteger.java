package lang.wrapper;

/*
기본형을 감싸서 만드는 클래스를 래퍼클래스라 한다.
직접 만든 래퍼 클래스
- int 값을 가지고 클래스 만들기
 */
public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
//        return "" + value;
        return String.valueOf(value);
    }
}

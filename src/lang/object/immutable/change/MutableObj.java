package lang.object.immutable.change;

// 변경 가능한 객체에서 값을 변경하는 간단한 예를 만든다.
public class MutableObj {

    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addValue) {
        value += addValue;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

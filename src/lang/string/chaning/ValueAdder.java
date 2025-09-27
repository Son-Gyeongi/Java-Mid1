package lang.string.chaning;

public class ValueAdder {

    private int value;

    public ValueAdder add(int addValue) {
        value += addValue; // 자신의 값 증가
        return this; // 나 자신 반환
    }

    public int getValue() {
        return value;
    }
}

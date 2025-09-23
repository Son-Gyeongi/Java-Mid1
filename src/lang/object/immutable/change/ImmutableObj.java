package lang.object.immutable.change;

/*
불변 객체 - 값 변경
새로운 값을 더하는 add()와 같은 메서드가 있다.

불변 객체에서 add()메서드 구현
불변 객체는 변하지 않아야 한다.
 */
public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    // 불변인데 값을 변경 가능하다. -> 새로운 값 반환
    public ImmutableObj add(int addValue) {
        int result = value + addValue;
        return new ImmutableObj(result); // 새로운 객체를 만들어서 반환
    }

    public int getValue() {
        return value;
    }
}

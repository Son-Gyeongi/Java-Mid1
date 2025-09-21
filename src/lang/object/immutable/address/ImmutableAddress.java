package lang.object.immutable.address;

/*
불변 객체 도입
- 불변 클래스, 불변 객체
- Address 클래스를 상태가 변하지 않는 불변 클래스로 만든다.
 */
public class ImmutableAddress {

    private final String value; // 내부 값이 바뀌지 않는다.

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}

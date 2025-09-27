package lang.string.chaning;

// 메서드 체인닝 - Method Chaining
public class MethodChainingMain3 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        // 반환된 참조값
        int result = adder.add(1).add(2).add(3).getValue();
        System.out.println("result = " + result);
    }
}

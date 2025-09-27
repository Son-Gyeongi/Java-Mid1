package lang.string.chaning;

public class MethodChainingMain2 {

    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1);
        ValueAdder adder2 = adder1.add(2);
        ValueAdder adder3 = adder2.add(3);

        int result = adder3.getValue();
        System.out.println("result = " + result);

        // 참조값이 다 같다.
        System.out.println("result = " + adder);
        System.out.println("result = " + adder1);
        System.out.println("result = " + adder2);
        System.out.println("result = " + adder3);
    }
}

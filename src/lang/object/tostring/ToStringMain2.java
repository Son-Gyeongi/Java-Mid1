package lang.object.tostring;

public class ToStringMain2 {

    public static void main(String[] args) {
        Car car = new Car("Model Y");
        Dog dog1 = new Dog("멍멍이1", 2);
        Dog dog2 = new Dog("멍멍이2", 5);

        System.out.println("1. 단순 toString 호출");
        System.out.println(car.toString());
        System.out.println(dog1.toString());
        System.out.println(dog2.toString());

        System.out.println("2. println 내부에서 toString() 호출");
        System.out.println(car);
        System.out.println(dog1);
        System.out.println(dog2);

        System.out.println("3. Object 다형성 활용");
        ObjectPrinter.print(car);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        // 객체의 참조값 확인
        int i = System.identityHashCode(dog1); // 참조값
        System.out.println("i = " + i);
        // 간편하게 보기 위해 16진수로 바꾼다. (문자로 바뀐다.)
        String refValue = Integer.toHexString(i);
        System.out.println("refValue = " + refValue);

        String refValue2 = Integer.toHexString(System.identityHashCode(dog2));
        System.out.println("refValue2 = " + refValue2);
    }
}

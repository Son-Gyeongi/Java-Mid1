package lang.object.poly;

/*
Object[]을 만들면 세상의 모든 객체를 담을 수 있는 배열을 만들 수 있다.
 */
public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object object = new Object(); // Object 인스턴스도 만들 수 있다.

        Object[] objects = {dog, car, object};
        /*Object[] objects = new Object[3];
        objects[0] = dog;
        objects[1] = car;
        objects[2] = object;*/

        size(objects);
    }

    private static void size(Object[] objects) {
        // objects 길이 출력
        System.out.println("전달된 객체의 수는: " + objects.length);
    }
}

package lang.object.tostring;

public class Dog {

    private String dogName;
    private int age;

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    // Object 클래스의 toString() 메서드 오버라이딩(재정의)
    /*@Override
    public String toString() {
        return "dogName=" + dogName + "/age=" + age;
    }*/

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                '}';
    }
}

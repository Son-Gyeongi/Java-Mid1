package lang.clazz;

public class ClassCreateMain {
    public static void main(String[] args) throws Exception {
        Class helloClass = Hello.class;
        // Class helloClass = Class.forName("lang.clazz.Hello"); // 사용자의 입력을 받을 수 있다.

        // 객체 생성
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("hello = " + hello);
        System.out.println("result = " + result);
    }
}

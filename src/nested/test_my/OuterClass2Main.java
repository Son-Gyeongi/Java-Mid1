package nested.test_my;

// 내부 클래스를 완성해라
public class OuterClass2Main {
    public static void main(String[] args) {
        // 여기에 InnerClass의 hello() 메서드를 호출해라.
        OuterClass2 outer = new OuterClass2();
        OuterClass2.InnerClass innerClass = outer.new InnerClass();
        innerClass.hello();
    }
}

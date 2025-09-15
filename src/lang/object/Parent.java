package lang.object;

// 부모가 없으면 묵시적으로 Object 클래스를 상속받는다.
// 컴파일할 때 자바가 자동으로 넣어준다.
public class Parent { // extends Object { - 최상위 부모는 항상 Object

    public void parentMethod() {
        System.out.println("Parent.parentMethod");
    }
}

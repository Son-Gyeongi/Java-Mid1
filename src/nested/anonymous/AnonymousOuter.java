package nested.anonymous;

import nested.local.Printer;

/*
익명 클래스를 사용하면 클래스의 이름을 생략하고,
클래스의 선언과 생성을 한번에 처리할 수 있다.
익명클래스와 지역클래스는 같다.
 */
public class AnonymousOuter {

    private int outInstanceVar = 3;

    public void process(int paramVar) {
        int localVar = 1;

        // 클래스의 선언과 생성을 하나의 과정으로 합쳤다.
        Printer printer = new Printer() {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        };

        printer.print();
        System.out.println("printer.class = " + printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}

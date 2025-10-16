package nested.anonymous.ex_my;

import java.util.Random;

// 코드조각을 외부에서 전달할 수 있어야 한다.
public class Ex1RefMainV1 {

    public static void helloMethod(HelloInterface hello) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        hello.run();
        // 코드 조작 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        helloMethod(new HelloDice());
        helloMethod(new HelloSum());
    }
}

interface HelloInterface {
    void run();
}

class HelloDice implements HelloInterface {
    @Override
    public void run() {
        int randomValue = new Random().nextInt(6) + 1; // 랜덤 주사위 1~6
        System.out.println("주사위 = " + randomValue);
    }
}

class HelloSum implements HelloInterface {
    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("i = " + i);
        }
    }
}
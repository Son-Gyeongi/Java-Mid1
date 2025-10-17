package nested.anonymous.ex;

import java.util.Random;

// 자바 8 이후 람다 사용
public class Ex1RefMainV5 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 코드 조각 시작
        process.run();
        // 코드 조작 종료

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        // 람다로 만들기 (메서드를 인자로 넘기기)
        System.out.println("Hello 실행");
        hello(() -> {
            int randomValue = new Random().nextInt(6) + 1; // 랜덤 주사위 1~6
            System.out.println("주사위 = " + randomValue);
        });

        hello(() -> {
            for (int i = 0; i < 3; i++) {
                System.out.println("i = " + i);
            }
        });
    }
}

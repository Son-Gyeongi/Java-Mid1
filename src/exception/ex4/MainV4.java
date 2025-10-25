package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.
 */
public class MainV4 {

    public static void main(String[] args) {
        NetworkServiceV4 networkService = new NetworkServiceV4();

        // 사용자 입력
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try {
                networkService.sendMessage(input);
            } catch (Exception e) {
                // 모든 예외를 다 잡는다. - catch로 잡으면 예외가 복구 된거다.
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리
    private static void exceptionHandler(Exception e) {
        // 공통 처리
        System.out.println("==사용자에게 보여지는 HTML 화면 메시지==");
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생했습니다.");
        System.out.println("==개발자용 디버깅 메시지==");
        e.printStackTrace(System.out); // 스택 트레이스 출력
        // 일반적 사용: e.printStackTrace();, e.printStackTrace(System.err); 윗줄 명령어와 차이가 있다.

        // 필요하면 예외 별로, 별도의 추가 처리 가능
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}

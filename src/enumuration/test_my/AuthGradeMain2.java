package enumuration.test_my;

import java.util.Scanner;

// 인증 등급 열거형 활용하기
public class AuthGradeMain2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
            String grade = scanner.nextLine();
            AuthGrade.access(AuthGrade.valueOf(grade));
        }
    }
}

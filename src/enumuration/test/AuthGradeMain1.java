package enumuration.test;

import static enumuration.test.AuthGrade.*;

// 인증 등급 열거형 조회하기
public class AuthGradeMain1 {

    public static void main(String[] args) {
        AuthGrade[] values = values();
        for (AuthGrade value : values) {
            System.out.println("grade=" + value.name() + ", level=" + value.getLevel()
                    + ", 설명=" + value.getDescription());
        }
    }
}

package enumuration.test_my;

import static enumuration.test_my.AuthGrade.*;

// 인증 등급 열거형 조회하기
public class AuthGradeMain1 {

    public static void main(String[] args) {
        System.out.println("grade=" + GUEST + ", level=" + GUEST.getLevel()
                + ", 설명=" + GUEST.getDescription());
        System.out.println("grade=" + LOGIN + ", level=" + LOGIN.getLevel()
                + ", 설명=" + LOGIN.getDescription());
        System.out.println("grade=" + ADMIN + ", level=" + ADMIN.getLevel()
                + ", 설명=" + ADMIN.getDescription());
    }
}

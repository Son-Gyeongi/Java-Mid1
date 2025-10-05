package enumuration.ex2;

import enumuration.ex3.Grade;

public class ClassGradeEx3_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*
        Grade grade = new Grade(); // enum 타입은 인스턴스 생성X, 컴파일 오류
        int result = discountService.discount(grade, price);
        System.out.println("result price: " + result);
*/
    }
}

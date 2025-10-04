package enumuration.ex2;

// 타입 안전 열거형 패턴(Type-Safe Enum Pattern)
public class StringGradeEx2_2 {

    public static void main(String[] args) {
        int price = 10000;

        DiscountService discountService = new DiscountService();
/*
        ClassGrade newClassGrade = new ClassGrade(); // 생성X, 컴파일 오류
        int result = discountService.discount(newClassGrade, price);
        System.out.println("newClassGrade 등급의 할인 금액: " + result);
*/
    }
}

package enumuration.ref1;

// 타입 안전 열거형 패턴(Type-Safe Enum Pattern) 직접 구현
// 회원 등급의 할인율을 가지도록 하는 리팩토링
public class ClassGrade {
    // 각각의 회원 등급별로 상수를 선언
    public static final ClassGrade BASIC = new ClassGrade(10);
    public static final ClassGrade GOLD = new ClassGrade(20);
    public static final ClassGrade DIAMOND = new ClassGrade(30);

    private final int discountPercent;

    // private 생성자 추가 - 외부에서 ClassGrade 생성 막기
    private ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 회원 등급 조회

    public int getDiscountPercent() {
        return discountPercent;
    }
}

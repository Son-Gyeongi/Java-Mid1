package enumuration.ex2;

// 타입 안전 열거형 패턴(Type-Safe Enum Pattern) 직접 구현
// 회원 등급을 다루는 클래스 만들기
public class ClassGrade {
    // 각각의 회원 등급별로 상수를 선언
    public static final ClassGrade BASIC = new ClassGrade();
    public static final ClassGrade GOLD = new ClassGrade();
    public static final ClassGrade DIAMOND = new ClassGrade();

    // private 생성자 추가 - 외부에서 ClassGrade 생성 막기
    private ClassGrade() {}
}

package enumuration.ref3;

/*
열거형을 사용
캡슐화 원칙 - 내 데이터 내가 계산
 */
public enum Grade {
    // 등급별로 할인율 결정
    BASIC(10), GOLD(20), DIAMOND(30),
    VIP(40);

    private final int discountPercent;

    // 생성자
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 메서드
    public int getDiscountPercent() {
        return discountPercent;
    }

    // 추가
    /*
    캡슐화 원칙 - 내 데이터 내가 계산
    할인율 스스로 계산
     */
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}

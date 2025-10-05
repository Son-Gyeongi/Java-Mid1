package enumuration.ref2;

/*
열거형을 사용
- 열거형도 클래스이다.
 */
public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    // 생성자
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 메서드
    public int getDiscountPercent() {
        return discountPercent;
    }
}

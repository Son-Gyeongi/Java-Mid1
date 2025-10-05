package enumuration.ref3;

// 열거형을 사용
public class DiscountService {

    public int discount(Grade grade, int price) {
        // Grade에 있는 discount() 호출
        return grade.discount(price);
    }
}

package lang.object.equals;

public class EqualsMainV2 {

    public static void main(String[] args) {
        // 인스턴스는 다르지만 고객번호는 같다.
        UserV2 user1 = new UserV2("id-100");
        UserV2 user2 = new UserV2("id-100");

        // identity 동일성(인스턴스 참조값 비교)
        System.out.println("identity = " + (user1 == user2));
        // equality 동등성
        System.out.println("equality = " + (user1.equals(user2)));
    }
}

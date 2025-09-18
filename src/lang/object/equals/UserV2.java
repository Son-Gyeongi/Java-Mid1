package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }

    // id(고객번호)가 같으면 논리적으로 같은 객체로 정의하겠다.
    // 최소한의 버전
/*
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // 다운캐스팅
        return id.equals(user.id); // 문자끼리 비교 String 클래스의 equals() 메서드
    }
*/

    // 변경 - 정확한 equals 구현, IDE 자동 생성
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return Objects.equals(id, userV2.id);
    }
}

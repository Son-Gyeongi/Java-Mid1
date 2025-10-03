package lang.math.test;

import java.util.Random;

// 로또 번호 자동 생성기
// LottoGenerator를 객체로 만들거다.
public class LottoGenerator {
    // 랜덤 클래스 만들기
    private final Random random = new Random();
    private int[] lottoNumbers;
    private int count; // 현재 lotto 뽑은 갯수

    // 생성된 6개 로또 번호 반환
    public int[] generate() {
        // 새로 시작할 때 다시 초기값을 준다.
        lottoNumbers = new int[6];
        count = 0;

        while (count < 6) {
            // 1부터 45 사이의 숫자 생성
            int number = random.nextInt(45) + 1;
            // 중복되지 않은 경우에만 배열에 추가
            if (isUnique(number)) {
                lottoNumbers[count] = number;
                count++;
            }
        }

        return lottoNumbers;
    }

    // 이미 생성된 번호와 중복되는지 검사
    private boolean isUnique(int number) {
        for (int i = 0; i < count; i++) {
            if (lottoNumbers[i] == number) {
                return false;
            }
        }
        return true;
    }
}

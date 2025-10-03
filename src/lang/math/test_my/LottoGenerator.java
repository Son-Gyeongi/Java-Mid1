package lang.math.test_my;

import java.util.Random;

// 로또 번호 자동 생성기
public class LottoGenerator {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotto = new int[6];
        lotto[0] = random.nextInt(45) + 1;

        for (int i = 1; i < 6; i++) {
            int check = i; // i가 변하면 같은 번호(배열요소)를 찾은 거다.
            int randomNum = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (lotto[j] == randomNum) {
                    i--;
                    break;
                }
            }

            if (check == i) lotto[i] = randomNum;
        }

        System.out.print("로또 번호: ");
        for (int i : lotto) {
            System.out.print(i +" ");
        }
    }
}

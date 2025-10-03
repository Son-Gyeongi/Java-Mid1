package lang.system;

import java.util.Arrays;
import java.util.Map;

public class SystemMain {

    public static void main(String[] args) {
        // 현재 시간(밀리초)을 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("currentTimeMillis = " + currentTimeMillis);

        // 현재 시간(나노초)을 가져온다.
        long currentTimeNano = System.nanoTime();
        System.out.println("currentTimeNano = " + currentTimeNano);

        // 환경 변수를 읽는다. - 시스템 환경 변수들 세팅 읽어올 수 있다.
        System.out.println("getenv = " + System.getenv());

        // 시스템 속성을 읽는다. - 자바가 사용하는 시스템의 기본적인 환경 설정
        System.out.println("properties = " + System.getProperties());
        System.out.println("Java version: " + System.getProperty("java.version"));

        // 배열을 고속으로 복사한다. -> 자바가 아닌 운영체제와 하드웨어에서 복사
        // 빠른 성능 제공
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] copedArray = new char[5];
        System.arraycopy(originalArray, 0, copedArray, 0, originalArray.length);

        // 배열 출력
        System.out.println("copedArray = " + copedArray);
        System.out.println("copedArray = " + Arrays.toString(copedArray));

        // 프로그램 종료
        // 가급적 사용하지 말기 -> 프로그램 종료전 뒷정리가 필요
        System.exit(0);
    }
}

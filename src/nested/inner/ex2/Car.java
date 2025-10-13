package nested.inner.ex2;

/*
내부 클래스로 리팩토링 후
엔진은 차의 내부에서만 사용된다.
엔진을 차의 내부 클래스로 만들어보자.
또한 엔진은 차의 충전 레벨과 모델명에 접근해야 한다.
 */
public class Car {
    private String model; // 모델 정보
    private int chargeLevel; // 충전 레벨
    private Engine engine; // 엔진 가진다.

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    // 자동차 시동
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }

    private class Engine {

        public void start() {
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println(model + "의 엔진을 구동합니다.");
        }
    }
}

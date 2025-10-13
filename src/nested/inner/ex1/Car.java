package nested.inner.ex1;

public class Car {
    private String model; // 모델 정보
    private int chargeLevel; // 충전 레벨
    private Engine engine; // 엔진 가진다.

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine(this);
    }

    // Engine 에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    // Engine 에서만 사용하는 메서드
    public int getChargeLevel() {
        return chargeLevel;
    }

    // 자동차 시동
    public void start() {
        engine.start();
        System.out.println(model + " 시작 완료");
    }
}

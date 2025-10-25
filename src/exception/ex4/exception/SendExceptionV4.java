package exception.ex4.exception;

// 데이터 전송 실패시 발생하는 예외, 내부에 전송을 시도한 데이터인 sendData 보관
// NetworkClientExceptionV4 상속
public class SendExceptionV4 extends NetworkClientExceptionV4 {

    private final String sendData;

    public SendExceptionV4(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}

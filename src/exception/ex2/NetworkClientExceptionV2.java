package exception.ex2;

// 네트워크 클라이언트에서 발생하는 예외
public class NetworkClientExceptionV2 extends Exception {

    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

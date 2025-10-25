package exception.ex4.exception;

/*
네트워크 클라이언트에서 발생하는 예외
예외를 세분화해서 각각의 상황에 맞게 따로 예외를 만든다.
RuntimeException - 언체크 예외
 */
public class NetworkClientExceptionV4 extends RuntimeException {
    public NetworkClientExceptionV4(String message) {
        super(message);
    }
}

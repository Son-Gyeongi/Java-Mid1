package exception.ex2;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.

NetworkService - 전체적인 흐름 관리

finally
자바는 어떤 경우라도 반드시 호출되는 finally 기능을 제공
finally 블럭은 반드시 호출된다.
주로 try 에서 사용한 자원을 해제할 때 주로 사용한다.
 */
public class NetworkServiceV2_5 {

    // 복잡한 NetworkClient 로직 해결
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            // 예외 흐름
            System.out.println("[오류] 코드: " + e.getErrorCode()
                    + ", 메시지: " + e.getMessage());
        } finally {
            // 반드시 호출해야 하는 마무리 흐름
            client.disconnect();
        }
    }
}

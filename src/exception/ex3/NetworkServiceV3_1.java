package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.

NetworkService - 전체적인 흐름 관리

finally
자바는 어떤 경우라도 반드시 호출되는 finally 기능을 제공
finally 블럭은 반드시 호출된다.
주로 try 에서 사용한 자원을 해제할 때 주로 사용한다.
 */
public class NetworkServiceV3_1 {

    // 복잡한 NetworkClient 로직 해결
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV3 client = new NetworkClientV3(address);
        client.initError(data); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(data);
        } catch (ConnectExceptionV3 e) {
            System.out.println("[연결 오류] 주소: " + e.getAddress()
                    + ", 메시지: " + e.getMessage());
        } catch (SendExceptionV3 e) {
            System.out.println("[전송 오류] 전송 데이터: " + e.getSendData()
                    + ", 메시지: " + e.getMessage());
        } finally {
            // 반드시 호출해야 하는 마무리 흐름
            client.disconnect();
        }
    }
}

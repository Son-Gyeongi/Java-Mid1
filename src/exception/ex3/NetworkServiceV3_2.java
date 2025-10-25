package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.

NetworkService - 전체적인 흐름 관리
 */
public class NetworkServiceV3_2 {

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
        } catch (NetworkClientExceptionV3 e) {
            System.out.println("[네트워크 오류] 메시지: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("[알 수 없는 오류] 메시지: " + e.getMessage());
        } finally {
            // 반드시 호출해야 하는 마무리 흐름
            client.disconnect();
        }
    }
}

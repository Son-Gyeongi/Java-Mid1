package exception.ex4;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.

NetworkService - 전체적인 흐름 관리
 */
public class NetworkServiceV4 {

    // 복잡한 NetworkClient 로직 해결
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV4 client = new NetworkClientV4(address);
        client.initError(data); // 추가

        try {
            // 정상 흐름
            client.connect();
            client.send(data);
        } finally {
            // 반드시 호출해야 하는 마무리 흐름
            client.disconnect();
        }
    }
}

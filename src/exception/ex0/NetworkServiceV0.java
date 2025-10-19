package exception.ex0;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.

NetworkServiceV0 - 전체적인 흐름 관리
 */
public class NetworkServiceV0 {

    // 복잡한 NetworkClient 로직 해결
    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV0 client = new NetworkClientV0(address);

        client.connect();
        client.send(data);
        client.disconnect();
    }
}

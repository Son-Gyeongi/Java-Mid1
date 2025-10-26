package exception.ex4;

import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.
 */
public class NetworkClientV5 implements AutoCloseable {

    private final String address; // 접속할 외부 서버 주소
    public boolean connectError; // 실패 시뮬레이션을 위한 필드
    public boolean sendError; // 실패 시뮬레이션을 위한 필드

    public NetworkClientV5(String address) {
        this.address = address;
    }

    // 외부 서버에 연결
    public void connect() {
        // 연결 실패
        if (connectError) {
            throw new ConnectExceptionV4(address, address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    // 연결한 외부 서버에 데이터를 전송
    public void send(String data) {
        // 전송 실패
        if (sendError) {
            throw new SendExceptionV4(data, address + " 서버에 데이터 전송 실패: " + data);
            // throw new RuntimeException("ex");
        }
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
    }

    // 외부 서버와 연결을 해제
    public void disconnect() {
        // 연결 해제
        System.out.println(address + " 서버 연결 해제");
    }

    public void initError(String data) {
        if (data.contains("error1")) {
            connectError = true;
        }
        if (data.contains("error2")) {
            sendError = true;
        }
    }

    // try-catch-resources
    @Override
    public void close() {
        // try가 끝나면 자동으로 close() 호출된다. - 자원을 더 빨리 해제한다.
        System.out.println("NetworkClientV5.close");
        disconnect();
    }
}

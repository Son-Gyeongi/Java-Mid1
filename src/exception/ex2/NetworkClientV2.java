package exception.ex2;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.
 */
public class NetworkClientV2 {

    private final String address; // 접속할 외부 서버 주소
    public boolean connectError; // 실패 시뮬레이션을 위한 필드
    public boolean sendError; // 실패 시뮬레이션을 위한 필드

    public NetworkClientV2(String address) {
        this.address = address;
    }

    // 외부 서버에 연결
    public void connect() throws NetworkClientExceptionV2 {
        // 연결 실패
        if (connectError) {
            // 에러코드, 메시지
            throw new NetworkClientExceptionV2("connectError", address + " 서버 연결 실패");
        }
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
    }

    // 연결한 외부 서버에 데이터를 전송
    public void send(String data) throws NetworkClientExceptionV2 {
        // 전송 실패
        if (sendError) {
            throw new NetworkClientExceptionV2("sendError", address + " 서버에 데이터 전송 실패: " + data);
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
}

package exception.ex0;

/*
해당 프로그램은 사용자의 입력을 받고,
입력 받은 문자를 외부 서버에 전송하는 프로그램이다.
 */
public class NetworkClientV0 {

    private final String address; // 접속할 외부 서버 주소

    public NetworkClientV0(String address) {
        this.address = address;
    }

    // 외부 서버에 연결
    public String connect() {
        // 연결 성공
        System.out.println(address + " 서버 연결 성공");
        return "success";
    }

    // 연결한 외부 서버에 데이터를 전송
    public String send(String data) {
        // 전송 성공
        System.out.println(address + " 서버에 데이터 전송: " + data);
        return "success";
    }

    // 외부 서버와 연결을 해제
    public void disconnect() {
        // 연결 해제
        System.out.println(address + " 서버 연결 해제");
    }
}

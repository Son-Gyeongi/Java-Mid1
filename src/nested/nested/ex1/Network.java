package nested.nested.ex1;

// 정적 중첨 클래스로 리팩토링 전
public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }
}

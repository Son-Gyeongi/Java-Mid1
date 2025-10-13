package nested.nested.ex2;

// 정적 중첨 클래스로 리팩토링 후
public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    // 외부에서 해당 클래스에 접근 안됨, 내부에서 사용 가능
    private static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}

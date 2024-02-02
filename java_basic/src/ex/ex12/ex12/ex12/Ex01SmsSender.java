package ex.ex12.ex12.ex12;

public class Ex01SmsSender implements Ex01Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("SMS를 발송합니다: " + message);
    }
}

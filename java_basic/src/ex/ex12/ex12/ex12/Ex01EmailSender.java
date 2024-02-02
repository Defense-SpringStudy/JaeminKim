package ex.ex12.ex12.ex12;

public class Ex01EmailSender implements Ex01Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("메일을 발송합니다: " + message);
    }
}

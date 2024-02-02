package ex.ex12;

public class Ex01FaceBookSender implements Ex01Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북에 발송합니다: " + message);
    }
}

package ex.ex12.ex12;

public class Ex01Main {
    public static void main(String[] args) {
        Ex01Sender[] senders = {new Ex01EmailSender(), new Ex01SmsSender(), new
                Ex01FaceBookSender()};
        for (Ex01Sender sender : senders) {
            sender.sendMessage("환영합니다!"); }
    }
}

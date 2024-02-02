package ex.ex12.ex12;

public class Ex02KakaoPay extends Ex02PayService {
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}

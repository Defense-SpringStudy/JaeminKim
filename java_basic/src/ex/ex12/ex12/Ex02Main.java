package ex.ex12.ex12;

public class Ex02Main {
    public static void main(String[] args) {
        Ex02PayService payService = new Ex02PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        String payOption4 = "Ali";
        int amount4 = 1000;
        payService.processPay(payOption4, amount4);

        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
    }
}

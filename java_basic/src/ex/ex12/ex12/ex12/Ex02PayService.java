package ex.ex12.ex12.ex12;

public class Ex02PayService {
    public void processPay(String option, int amount) {
        boolean result;

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        if (option.equals("kakao")) {
            Ex02KakaoPay kakaoPay = new Ex02KakaoPay();
            result = kakaoPay.pay(amount);
        }
        else if (option.equals("naver")) {
            Ex02NaverPay naverPay = new Ex02NaverPay();
            result = naverPay.pay(amount);
        }
        else if (option.equals("Ali"))
        {
            Ex02AliPay AliPay = new Ex02AliPay();
            result = AliPay.pay(amount);
        }
        else {
            System.out.println("결제 수단이 없습니다.");
            result = false;
        }

        if (result) {
            System.out.println("결제가 성공했습니다.");
        }
        else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}

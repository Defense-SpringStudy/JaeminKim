package ex.ex12;

import java.util.Scanner;

public class Ex03Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ex02PayService payService = new Ex02PayService();
        String option;
        int amount;

        while (true) {
            System.out.print("결제 수단을 입력하세요: ");
            option = scanner.nextLine();
            if (option.equals("exit")) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }
            System.out.print("결제 금액을 입력하세요: ");
            amount = scanner.nextInt();
            payService.processPay(option, amount);
            scanner.nextLine();
        }
    }
}
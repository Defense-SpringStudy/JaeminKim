package ex.ex09;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option, balance = 0;

        while (true)
        {
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");
            option = scanner.nextInt();

            if (option == 1)
                balance = inAmount(balance);
            else if (option == 2)
                balance = outAmount(balance);
            else if (option == 3)
                System.out.println("현재 잔액: " + balance + "원");
            else if (option == 4)
            {
                System.out.println("시스템을 종료합니다.");
                break;
            }
        }
    }

    public static int inAmount(int balance)
    {
        Scanner scanner = new Scanner(System.in);

        int inputMoney;

        System.out.print("입금액을 입력하세요: ");
        inputMoney = scanner.nextInt();
        balance += inputMoney;
        System.out.println(inputMoney + "원을 입금하였습니다. 현재 잔액: " + balance);

        return (balance);
    }

    public static int outAmount(int balance)
    {
        Scanner scanner = new Scanner(System.in);

        int outputMoney;

        System.out.print("출금액을 입력하세요: ");
        outputMoney = scanner.nextInt();
        if (balance >= outputMoney)
        {
            balance -= outputMoney;
            System.out.println(outputMoney + "원을 출금하였습니다. 현재 잔액: " + balance);
        }
        else
            System.out.println(outputMoney + "원을 출금하려 했으나 잔액이 부족합니다.");

        return (balance);
    }
}

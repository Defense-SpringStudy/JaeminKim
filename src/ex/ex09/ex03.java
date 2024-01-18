package ex.ex09;

public class ex03 {
    public static void main(String[] args) {
        int balance = 10000;
        balance = inAmount(balance, 2000);
        balance = drawAmount(balance, 4000);
        balance = inAmount(balance, 5000);
        balance = drawAmount(balance, 14000);
    }

    public static int inAmount(int balance, int depositAmount)
    {
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        return balance;
    }

    public static int drawAmount(int balance, int withdrawAmount)
    {
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        System.out.println("최종 잔액: " + balance + "원");
        return balance;
    }
}

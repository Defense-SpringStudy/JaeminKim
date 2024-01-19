package ex.ex02;

public class Ex02Account {
    int balance = 0;

    void deposit(int amount)
    {
        balance += amount;
        System.out.println("입금을 완료했습니다. 잔고: " + balance);
    }

    void withdraw(int amount)
    {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("출금을 완료했습니다. 잔고: " + balance);
        }
        else
            System.out.println("잔액이 부족. 잔고: " + balance);
    }

    void showBalanceStatus()
    {
        System.out.println("잔고: " + balance);
    }
}

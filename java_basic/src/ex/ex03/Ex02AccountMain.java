package ex.ex02;

public class Ex02AccountMain {
    public static void main(String[] args) {
        Ex02Account account = new Ex02Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);
        account.showBalanceStatus();
    }
}

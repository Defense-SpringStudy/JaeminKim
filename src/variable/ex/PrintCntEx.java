package variable.ex;

public class PrintCntEx {
    public static void main(String[] args) {
        int cnt = 1;

        while (cnt <= 10)
            System.out.println("cnt = " + cnt++);
        for (cnt = 1; cnt <= 10; cnt++)
            System.out.println("cnt = " + cnt);
    }
}

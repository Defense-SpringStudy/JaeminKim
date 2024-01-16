package variable.ex;

public class WhileEx {
    public static void main(String[] args) {
        int num = 2;
        int cnt = 1;

        while (cnt <= 10)
        {
            System.out.println(num);
            num += 2;
            cnt++;
        }

        num = 2;
        for (cnt = 1; cnt <= 10; cnt++)
        {
            System.out.println(num);
            num += 2;
        }
    }
}

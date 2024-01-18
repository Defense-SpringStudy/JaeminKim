package variable.ex;

public class WhileEx2 {
    public static void main(String[] args) {
        int max = 3, num = 1, sum = 0;

        while (num <= max)
        {
            sum += num++;
            System.out.println(sum);
        }

        for (num = 1, sum = 0; num <= max; num++) {
            sum += num;
            System.out.println(sum);
        }
    }
}

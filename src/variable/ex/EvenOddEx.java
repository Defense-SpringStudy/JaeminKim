package variable.ex;

public class EvenOddEx {
    public static void main(String[] args) {
        int x = 4;

        String IsOdd = (x % 2 == 1) ? "홀수" : "짝수";

        System.out.println(IsOdd);
    }
}

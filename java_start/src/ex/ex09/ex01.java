package ex.ex09;

public class ex01 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int x = 15;
        int y = 25;
        int z = 35;
        printAvarage(a, b, c);
        printAvarage(x, y, z);
    }

    public static void printAvarage(int a, int b, int c)
    {
        int sum = a + b + c;
        double average = sum / 3.0;
        System.out.println("평균값: " + average);
    }

}

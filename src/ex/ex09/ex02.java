package ex.ex09;

public class ex02 {
    public static void main(String[] args) {
        printMessage("Hello, world!", 12);
    }

    public static void printMessage(String message, int soo)
    {
        for (int i = 0; i < soo; i++)
        {
            System.out.println(message);
        }
    }
}

public class haert {
    public static void main(String[] args) throws InterruptedException {
        int n = 6;

        for (int i = n/2; i <= n; i += 2)
        {
            for (int j = 1; j <= n - i; j += 2)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            for (int j = 1; j <= n - i; j ++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            System.out.println();
            Thread.sleep(500);
        }
        for (int i = n; i >= 0; i--)
        {
            for (int j = i; j < n; j++)
                System.out.print(" ");
            for (int j = 1; j < (i * 2) + 1; j++)
                System.out.print("*");
            System.out.println();
            Thread.sleep(500);

        }
        System.out.println("\n\n");
        Thread.sleep(500);
        System.out.println("김미나 안나뷰우우우우우♥");
    }
}

package ex.ex08;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[5];
        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < 5; i++)
            ints[i] = scanner.nextInt();
        System.out.println("출력");
        for (int i = ints.length - 1; i >= 0; i--)
        {
            System.out.print(ints[i]);
            if (i > 0)
                System.out.print(", ");
        }
    }
}

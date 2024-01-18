package ex.ex08;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[5];
        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < 5; i++)
            ints[i] = scanner.nextInt();
        System.out.println("출력");
        for (int i = 0; i < ints.length; i++)
        {
            System.out.print(ints[i]);
            if (i != (ints.length - 1))
                System.out.print(", ");
        }
    }
}

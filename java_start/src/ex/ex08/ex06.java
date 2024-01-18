package ex.ex08;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, max, num;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        num = scanner.nextInt();

        int[] ints = new int[num];

        System.out.println(num + "개의 정수를 입력하세요");
        for (int i = 0; i < num; i++) {
            ints[i] = scanner.nextInt();
        }
        min = ints[0];
        max = ints[0];
        for (int i = 0; i < num; i++)
        {
            if (min > ints[i])
                min = ints[i];
            if (max < ints[i])
                max = ints[i];
        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}

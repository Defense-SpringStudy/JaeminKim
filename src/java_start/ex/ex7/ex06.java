package ex.ex7;

import java.util.Scanner;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1, num2, temp;

        System.out.print("첫 번째 숫자를 입력하세요: ");
        num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요: ");
        num2 = scanner.nextInt();
        if (num1 > num2)
        {
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("두 숫자 사이의 모든 정수: ");
        for (int i = 0; i <= (num2 - num1); i++)
        {
            System.out.print((num1 + i));
            if (i != (num2 - num1))
                System.out.print(", ");
            }
    }
}

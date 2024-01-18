package ex.ex08;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, num;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        num = scanner.nextInt();

        int[] ints = new int[num];

        System.out.println(num + "개의 정수를 입력하세요");
        for (int i = 0; i < num; i++) {
            ints[i] = scanner.nextInt();
            sum += ints[i];
        }
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + (double) sum / ints.length);
    }
}

package ex.ex08;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] ints = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요");
        for (int i = 0; i < 5; i++) {
            ints[i] = scanner.nextInt();
            sum += ints[i];
        }
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + (double) sum / ints.length);
    }
}

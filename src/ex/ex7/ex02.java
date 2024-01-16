package ex.ex7;

import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soo;

        System.out.print("하나의 정수를 입력하세요 : ");
        soo = scanner.nextInt();

        if (soo % 2 == 0)
            System.out.println("입력한 숫자 " + soo + "는 짝수입니다.");
        else
            System.out.println("입력한 숫자 " + soo + "는 홀수입니다.");
    }
}

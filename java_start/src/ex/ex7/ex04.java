package ex.ex7;

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int level;

        System.out.print("구구단의 단 수를 입력해주세요: ");
        level = scanner.nextInt();
        System.out.println(level + "단의 구구단");
        for (int i = 0; i < 9; i++)
            System.out.println(level + " * " + (i + 1) + " = " + level * (i + 1));
    }
}

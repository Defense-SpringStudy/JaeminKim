package ex.ex08;

import java.util.Scanner;

public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요: ");
        int scnt = scanner.nextInt();
        int[][] students = new int[scnt][3];
        int[] sums = new int[scnt];

        for (int i = 0; i < scnt; i++)
        {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요");
            System.out.print("국어 점수: ");
            students[i][0] = scanner.nextInt();
            System.out.print("영어 점수: ");
            students[i][1] = scanner.nextInt();
            System.out.print("수학 점수: ");
            students[i][2] = scanner.nextInt();
            sums[i] = students[i][0] + students[i][1] + students[i][2];
        }
        for (int i = 0; i < scnt; i++)
        {
            System.out.println((i + 1) + "번 학생의 총점: " + sums[i] + " 평균: " + (double) sums[i] / students[i].length);
        }
    }
}

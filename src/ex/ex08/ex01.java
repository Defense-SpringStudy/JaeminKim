package ex.ex08;

public class ex01 {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int total = students[0] + students[1] + students[2] + students[3] + students[4];
        double average = (double) total / 5;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}

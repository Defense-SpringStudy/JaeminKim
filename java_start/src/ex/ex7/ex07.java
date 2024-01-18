package ex.ex7;

import java.util.Scanner;

public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int age;

        while (true)
        {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            name = scanner.nextLine();
            if (name.equals("종료"))
            {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            age = scanner.nextInt();
            scanner.nextLine(); // 숫자 입력후 줄바꿈처리를 해주어야 붕 뜨는 줄이 없다.
            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}

package ex.ex7;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        int price = 0,quantity = 0, sum = 0;
        String name = "name";

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    name = scanner.nextLine();
                    System.out.print("상품의 가격을 입력하세요: ");
                    price = scanner.nextInt();
                    System.out.print("구매 수량을 입력하세요: ");
                    quantity = scanner.nextInt();
                    sum += price * quantity;
                    System.out.println("상폼명: " + name + " 가격: " + price + " 수량: " + quantity + " 합계: " + price * quantity);
                    break;
                case 2:
                    System.out.println("총 비용: " + sum);
                    sum = 0;
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다");
                    break;
                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
            }
            if (option == 3)
                break;
        }
    }
}

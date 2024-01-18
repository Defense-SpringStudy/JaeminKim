package ex.ex7;

import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String foodName;
        int foodPrice, foodQuantity;

        System.out.print("음식의 이름을 입력해주세요: ");
        foodName = scanner.nextLine();
        System.out.print("음식의 가격을 입력해주세요: ");
        foodPrice = scanner.nextInt();
        System.out.print("음식의 수량을 입력해주세요: ");
        foodQuantity = scanner.nextInt();

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + foodPrice * foodQuantity + "원입니다.");
    }
}

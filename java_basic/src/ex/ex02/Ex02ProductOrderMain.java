package ex.ex02;

import java.util.Scanner;

public class Ex02ProductOrderMain
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int scale, price, quantity;
        String productName;

        System.out.print("입력할 주문의 개수를 입력하세요: ");
        scale = scanner.nextInt();
        Ex01ProductOrder[] orders = new Ex01ProductOrder[scale];

        for (int i = 0; i < scale; i++)
        {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");
            System.out.print("상품명: ");
            scanner.nextLine();
            productName = scanner.nextLine();
            System.out.print("가격: ");
            price = scanner.nextInt();
            System.out.print("수량: ");
            quantity = scanner.nextInt();
            orders[i] = createOrder(productName, price, quantity);
        }
        printOrders(orders);
        System.out.println("총 결제 금액: " + getTotalAmount(orders));
    }
    static Ex01ProductOrder createOrder(String productName, int price, int quantity)
    {
        Ex01ProductOrder productOrder = new Ex01ProductOrder();

        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;

        return (productOrder);
    }

    static void printOrders(Ex01ProductOrder[] orders)
    {
        for (Ex01ProductOrder productOrder: orders)
            System.out.println("상품명: " + productOrder.productName + ", 가격: " + productOrder.price + ", 수량: " + productOrder.quantity);
    }
    
    static int getTotalAmount(Ex01ProductOrder[] orders)
    {
        int total = 0;

        for (Ex01ProductOrder productOrder: orders)
            total += productOrder.price * productOrder.quantity;
        return (total);
    }
}

package ex.ex01;


import java.util.Scanner;

public class ex03Main {
    public static void main(String[] args) {
        int total = 0;
        ex03ProductOrder[] ex03ProductOrders = new ex03ProductOrder[3];

        ex03ProductOrder ex03ProductOrder1 = new ex03ProductOrder();
        ex03ProductOrder1.productName = "두부";
        ex03ProductOrder1.price = 2000;
        ex03ProductOrder1.quantity = 2;
        ex03ProductOrders[0] = ex03ProductOrder1;

        ex03ProductOrder ex03ProductOrder2 = new ex03ProductOrder();
        ex03ProductOrder2.productName = "김치";
        ex03ProductOrder2.price = 5000;
        ex03ProductOrder2.quantity = 1;
        ex03ProductOrders[1] = ex03ProductOrder2;

        ex03ProductOrder ex03ProductOrder3 = new ex03ProductOrder();
        ex03ProductOrder3.productName = "콜라";
        ex03ProductOrder3.price = 1500;
        ex03ProductOrder3.quantity = 2;
        ex03ProductOrders[2] = ex03ProductOrder3;

        for (ex03ProductOrder ex03ProductOrder: ex03ProductOrders)
        {
            total += ex03ProductOrder.price * ex03ProductOrder.quantity;
            System.out.println("상품명: " + ex03ProductOrder.productName + ", 가격: " + ex03ProductOrder.price + ", 수량: " + ex03ProductOrder.quantity);
        }
        System.out.println("총 결제 금액: " + total);
    }
}

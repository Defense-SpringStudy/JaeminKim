package ex.ex02;

import ex.ex01.ex03ProductOrder;

public class Ex01ProductOrderMain
{
    public static void main(String[] args) {
        Ex01ProductOrder[] orders = new Ex01ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);
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

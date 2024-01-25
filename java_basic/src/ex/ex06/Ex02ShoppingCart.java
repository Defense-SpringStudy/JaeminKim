package ex.ex06;

public class Ex02ShoppingCart {
    private int count = 0;
    Ex02Item[] items = new Ex02Item[10];

    public void addItem(Ex02Item item)
    {
        if (count >= 10)
            System.out.println("장바구니가 가득 찼습니다.");
        else
            items[count++] = item;
    }

    public void displayItems() {
        int total = 0;

        for (int i = 0; i < count; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getPrice() * items[i].getQuantity());
            total += items[i].getPrice() * items[i].getQuantity();
        }

        System.out.println("전체 가격 합: " + total);
    }
}

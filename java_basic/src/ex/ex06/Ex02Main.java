package ex.ex06;

public class Ex02Main {
    public static void main(String[] args) {
        Ex02ShoppingCart cart = new Ex02ShoppingCart();

        Ex02Item item1 = new Ex02Item("마늘", 2000, 2);
        Ex02Item item2 = new Ex02Item("상추", 3000, 4);

        cart.addItem(item1);
        cart.addItem(item2);

        cart.displayItems();
    }
}

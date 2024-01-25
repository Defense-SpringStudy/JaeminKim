package ex.ex06;

public class Ex02Item {
    private String name;
    private int price, quantity;

    public Ex02Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    String getName()
    {
        return (name);
    }

    int getPrice()
    {
        return (price);
    }

    public int getQuantity() {
        return (quantity);
    }
}

package ex.ex09;

public class Ex01Item {
    private String name;
    private int price;

    public Ex01Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    void print()
    {
        System.out.println("이름: " + name + ", 가격: " + price);
    }

    int getPrice() {
        return price;
    }
}

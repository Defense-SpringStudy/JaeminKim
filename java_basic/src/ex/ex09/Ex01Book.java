package ex.ex09;

public class Ex01Book extends Ex01Item{
    private String author;
    int isbn;

    public Ex01Book(String name, int price, String author, int isbn) {
        super(name, price);
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    void print() {
        super.print();
        System.out.println("- 저자: " + author + ", isbn: " + isbn);
    }
}

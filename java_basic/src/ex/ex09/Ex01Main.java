package ex.ex09;

public class Ex01Main {
    public static void main(String[] args) {
        Ex01Book book = new Ex01Book("JAVA", 10000, "han", 12345);
        Ex01Album album = new Ex01Album("앨범", 15000, "seo");
        Ex01Movie movie = new Ex01Movie("영화1", 18000, "감독1", "배우1");

        book.print();
        album.print();
        movie.print();

        int sum = book.getPrice() + album.getPrice() + movie.getPrice();
        System.out.println("상품 가격의 합: " + sum);
    }
}

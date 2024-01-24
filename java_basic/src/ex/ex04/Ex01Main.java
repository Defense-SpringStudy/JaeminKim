package ex.ex04;

public class Ex01Main {
    public static void main(String[] args) {
        Ex01Book book1 = new Ex01Book();
        book1.displayInfo();
// title과 author만을 매개변수로 받는 생성자
        Ex01Book book2 = new Ex01Book("Hello Java", "Seo");
        book2.displayInfo();
// 모든 필드를 매개변수로 받는 생성자
        Ex01Book book3 = new Ex01Book("JPA 프로그래밍", "kim", 700);
        book3.displayInfo();
    }
}

package ex.ex02;

public class Ex01Main {
    public static void main(String[] args) {
        Ex01Rectangle rectangle = new Ex01Rectangle();

        rectangle.width = 5;
        rectangle.height = 8;
        int area = rectangle.calculateArea();
        System.out.println("넓이: " + area);

        int parameter = rectangle.calculatePerimeter();
        System.out.println("둘레 길이: " + parameter);

        boolean square = rectangle.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}

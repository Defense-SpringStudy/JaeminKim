package ex.ex07;

public class Ex01Car {
    private static int totalQuantity;
    private String name;

    public Ex01Car(String name) {
        this.name = name;
        totalQuantity++;
        System.out.println("차량 구입, 이름: " + name);
    }

    public static void showTotalCars(){
        System.out.println("구매한 차량 수: " + totalQuantity);
    }
}

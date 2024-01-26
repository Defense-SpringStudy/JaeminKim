package ex.ex07;

import static ex.ex07.Ex02MathArrayUtils.*;

public class Ex02Main {
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("sum = " + sum(values));
        System.out.println("average = " + average(values));
        System.out.println("min = " + min(values));
        System.out.println("max = " + max(values));
    }
}

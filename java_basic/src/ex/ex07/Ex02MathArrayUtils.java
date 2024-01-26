package ex.ex07;

public class Ex02MathArrayUtils {
    private Ex02MathArrayUtils() {

    }

    public static int sum(int[] array){
        int total = 0;
        for (int arr: array)
            total += arr;
        return total;
    }

    public static double average(int[] array)
    {
        return ((double) sum(array) / array.length);
    }

    public static int min(int[] array)
    {
        int min = array[0];

        for (int arr: array)
        {
            if (arr < min)
                min = arr;
        }

        return min;
    }
    public static int max(int[] array)
    {
        int max = array[0];

        for (int arr: array)
        {
            if (arr > max)
                max = arr;
        }

        return max;
    }
}

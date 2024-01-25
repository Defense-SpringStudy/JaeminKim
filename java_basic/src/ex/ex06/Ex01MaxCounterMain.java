package ex.ex06;

public class Ex01MaxCounterMain {
    public static void main(String[] args) {
        Ex01MaxCounter maxCounter = new Ex01MaxCounter(3);
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        maxCounter.increment();
        int cnt = maxCounter.getCount();
        System.out.println(cnt);
    }
}

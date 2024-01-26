package ex.ex09;

public class Ex01Movie extends Ex01Item{
    private String director, actor;

    public Ex01Movie(String name, int price, String director, String actor) {
        super(name, price);
        this.director = director;
        this.actor = actor;
    }

    @Override
    void print() {
        super.print();
        System.out.println("- 감독: " + director + ", 배우: " + actor);
    }
}

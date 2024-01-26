package ex.ex09;

public class Ex01Album extends Ex01Item{
    private String artist;

    public Ex01Album(String name, int price, String artist) {
        super(name, price);
        this.artist = artist;
    }

    @Override
    void print() {
        super.print();
        System.out.println("- 아티스트: " + artist);
    }
}

package variable.ex;

public class MovieRateEx {
    public static void main(String[] args) {
        double rating = 7.5;

        if (rating <= 9)
            System.out.println("어바웃 타임을 추천합니다.");
        else if (rating <= 8)
            System.out.println("토이스토리를 추천합니다.");
        else if (rating <= 7) {
            System.out.println("고질라를 추천합니다.");

        }
    }
}

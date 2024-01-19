package ex.ex01;

public class ex01_main {
    public static void main(String[] args) {
        ex01_MovieReview movieReview1 = new ex01_MovieReview();
        movieReview1.title = "리셉션";
        movieReview1.review = "인생은 무한루프";
        ex01_MovieReview movieReview2 = new ex01_MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        ex01_MovieReview[] movieReviews = {movieReview1, movieReview2};

         for (ex01_MovieReview movieReview : movieReviews)
             System.out.println("영화 제목: \"" + movieReview.title + "\", 리뷰: \"" + movieReview.review + "\"");
    }
}

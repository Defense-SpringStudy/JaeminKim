package ex.ex04;

public class Ex01Book {
    String title; //제목
    String author; //저자
    int page; //페이지 수

    Ex01Book()
    {
        this("", "", 0);
    }

    Ex01Book(String title, String author)
    {
        this(title, author, 0);
    }
    Ex01Book(String title, String author, int page)
    {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo()
    {
        System.out.println("제목: " + title + ", 저자: " + author + ", 페이지: " + page);
    }
}

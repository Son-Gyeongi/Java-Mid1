package nested.test_my.ex1;

// 도서 관리 시스템
public class Book {
    private String bookName; // 책 이름
    private String author; // 저자

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }
}

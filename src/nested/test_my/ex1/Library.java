package nested.test_my.ex1;

// 도서 관리 시스템
public class Library {
    // 코드 작성
    private Book[] books;
    private final int save; // 저장 가능한 책 개수
    private int count; // 저장한 책 개수 세기

    public Library(int save) {
        this.save = save;
        this.books = new Book[save];
    }

    public void addBook(String book, String author) {
        if (count == save) {
            System.out.println("도서관 저장공간이 부족합니다.");
            return;
        }
        books[count++] = new Book(book, author);
    }

    public void showBooks() {
        System.out.println("== 책 목록 출력 ==");
        for (Book book : books) {
            System.out.println("도서 제목: " + book.getBookName()
                    + ", 저자: " + book.getAuthor());
        }
    }
}

package homework.classes_homework.task_2;

public class Book {

    private String bookName;
    private String author;
    private int yearOfPublication;
    private int bookCode;

    public Book(String bookName, String author, int yearOfPublication, int bookCode) {
        this.bookName = bookName;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.bookCode = bookCode;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    // геттер будет доставать нам закрытое поле - имя книги
    public String getBookName() {
        return bookName;
    }

}

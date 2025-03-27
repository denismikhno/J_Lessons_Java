package homework.classes_homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class Reader {

    private String fio;
    private int readersTicketNumber;
    private String faculty;
    private String dateOfBirth;
    private String phoneNumber;
    private List<Book> takenBooks;

    public Reader(String fio, int readersTicketNumber, String faculty, String dateOfBirth, String phoneNumber) {
        this.fio = fio;
        this.readersTicketNumber = readersTicketNumber;
        this.faculty = faculty;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        // инициализация массива взятых читателем книг
        takenBooks = new ArrayList<>();
    }

    // Читатель берет одну книгу
    public void takeBook(Book book) {
        takenBooks.add(book);
        System.out.println(fio + " взял книгу: " + book.getBookName());
    }

    // Читатель берет список книг по названию
    public void takeBook(String... booksNames) {
        String titles = "";

        for (String name : booksNames) {
            takenBooks.add(new Book(name));
            titles += name + ", ";
        }

        titles = titles.substring(0, titles.length() - 2);
        System.out.printf("%s взял книги: %s\n", fio, titles);
    }

    // Читатель берет несколько книг
    public void takeBook(Book... takenBooks) {
        String titles = "";

        for (Book book : takenBooks) {
            this.takenBooks.add(book);
            titles += book.getBookName() + ", ";
        }

        titles = titles.substring(0, titles.length() - 2);
        System.out.printf("%s взял книги: %s\n", fio, titles);
    }

    // Читатель берет несколько книг из списка взятых книг
    public void takeBook(List<Book> takenBooks) {
        String titles = "";
        for (Book book : takenBooks) {
            this.takenBooks.add(book);
            titles += book.getBookName() + ", ";
        }
        titles = titles.substring(0, titles.length() - 2);
        System.out.printf("%s взял книги: %s\n", fio, titles);
    }

    // Читатель возвращает одну книгу
    public void returnBook(Book book) {
        takenBooks.remove(book);
        System.out.println(fio + " Вернул книгу: " + book.getBookName());
    }

    // Читатель возвращает книги по названию
    public void returnBook(String... booksName) {
        String titles = "";

        for (String name : booksName) {
            takenBooks.removeIf(book -> book.getBookName().equals(name));
            titles += name + ", ";
        }

        titles = titles.substring(0, titles.length() - 2);
        System.out.printf("%s вернул книги: %s\n", fio, titles);
    }

    // Читатель возвращает несколько книг
    public void returnBook(Book... takenBooks) {
        String titles = "";

        for (Book book : takenBooks) {
            this.takenBooks.remove(book);
            titles += book.getBookName() + ", ";
        }

        titles = titles.substring(0, titles.length() - 2);
        System.out.printf("%s вернул книги: %s\n", fio, titles);
    }

    // Читатель возвращает несколько книг из списка взятых книг
    public void returnBook(List<Book> takenBooks) {
        int index = 0;
        System.out.print(fio + " вернул книги: ");

        for (Book book : takenBooks) {
            this.takenBooks.remove(book);
            System.out.print(book.getBookName());
            index = takenBooks.indexOf(book);
            // добавляй запятую ко всем названиям книг, кромке последней
            // лучше использовать метод с titles = "";
            if (!(index == takenBooks.size() - 1)) System.out.print(", ");
        }

        System.out.println();
    }

    // показываем сколько читатель имеет на руках книг
    public void showBooks() {
        int index = 0;
        System.out.printf("\n%s имеет на руках след. книги: ", fio);

        for (Book book : takenBooks) {
            System.out.print(book.getBookName());
            index = takenBooks.indexOf(book);
            // добавляй запятую ко всем названиям книг, кромке последней
            // лучше использовать метод с titles = "";
            if (!(index == takenBooks.size() - 1)) System.out.print(", ");
        }

        System.out.printf("\n-------------------------------------------");
        System.out.println();
    }

}

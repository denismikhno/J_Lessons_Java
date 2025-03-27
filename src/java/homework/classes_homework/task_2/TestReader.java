package homework.classes_homework.task_2;

import java.util.ArrayList;
import java.util.List;

public class TestReader {

    public static void main(String[] args) {

        // создаем список книг, взятых Петровым
        List<Book> PetrovBooks = new ArrayList<>();

        // создаем Петрова
        Reader petrov = new Reader("Петров В. В.", 1, "Факультет Кибернетики", "21.02.2000", "+7555435465");

        // создаем книги
        Book book1 = new Book("Приключения", "Беляев А. Р.", 2005, 12444);
        Book book2 = new Book("Словарь", "Шлепаков А. С.", 2001, 11333);
        Book book3 = new Book("Энциклопедия", "Семенов Р. М.", 2000, 22888);
        Book book4 = new Book("Фантастика", "Головачев В. В.", 2005, 12444);

        Book book5 = new Book("Синяя книга");
        Book book6 = new Book("Красная книга");
        Book book7 = new Book("Зеленая книга");

        // Патров берет одну книгу
        petrov.takeBook(book1);
        petrov.showBooks();

        // наполняем список, взятых Петровым книг
        PetrovBooks.add(book2);
        PetrovBooks.add(book4);
        PetrovBooks.add(book3);

        // Петров берет несколько книг из списка взятых книг
        petrov.takeBook(PetrovBooks);
        petrov.showBooks();

        // формируем список книг, которые Петров будет отдавать
        PetrovBooks.remove(book2);
        // Петров возвращает несколько книг из списка взятых книг
        petrov.returnBook(PetrovBooks);
        petrov.showBooks();

        // Петров возвращает одну книгу
        petrov.returnBook(book2);
        petrov.showBooks();

        // Петров берет книги по названию
        petrov.takeBook("Фен-Шуй", "Изотерика");
        petrov.showBooks();

        // Петров возвращает книги по названию
        petrov.returnBook("Фен-Шуй");
        petrov.showBooks();

        // Петров берет несколько книг
        petrov.takeBook(book5, book6, book7);
        petrov.showBooks();

        // Петров возвращает несколько книг
        petrov.returnBook(book7, book5);
        petrov.showBooks();

    }

}

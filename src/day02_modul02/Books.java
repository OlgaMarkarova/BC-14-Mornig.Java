package day02_modul02;

import static day07.Logik01.split;

public class Books {
    String title;
    String author;
    String publisher;
    String category;
    int year;
    int numberOfCopies;
    int numberOfCopiesSold;
    int availability;

    public Books() {

    }

    void checkStoreAvailability(String booksTitle, int numberOfCopies, int numberOfCopiesSold) {
        availability = numberOfCopies - numberOfCopiesSold;
        System.out.println("На складе в наличии: " + availability + " копий ");
        split();
    }

    public Books(String booksTitle, String booksAuthor, String booksCategory) {
        title = booksTitle;
        author = booksAuthor;
        year = 2009;                      // yearOfBooksPublication;
        numberOfCopies = 2000;            // booksCopy;
        numberOfCopiesSold = 1990;        // booksCopySold;
        publisher = "АСТ";                // bookPublisher;
        category = booksCategory;
    }

    void displayInfo() {
        System.out.println("Серия книг: " + category);
        System.out.println("Название книги: " + title);
        System.out.println("Автор книги: " + author);
        System.out.println("Год издания книги: " + year);
        System.out.println("Колличесво копий книги: " + numberOfCopies);
        System.out.println("Издательство книги: " + publisher);
        split();
    }
}

class BooksTest {
    public static void main(String[] args) {
        Books book = new Books("Евгений Онегин", "Александр Пушкин", "Классика русской литературы");
        book.displayInfo();
        book.checkStoreAvailability("Евгений Онегин", 2000, 2000);

        Books myBook1 = new Books();
        myBook1.category = "Классика русской литературы";
        myBook1.title = "Анна Каренина";
        myBook1.author = "Лев Толстой";
        myBook1.year = 2010;
        myBook1.numberOfCopies = 2000;
        myBook1.numberOfCopiesSold = 1500;
        myBook1.publisher = "АСТ Москва";
        myBook1.displayInfo();

        Books myBook2 = new Books();
        myBook2.category = "Классика русской литературы";
        myBook2.title = "Мастер и Маргарита";
        myBook2.author = "Михаил Булгаков";
        myBook2.year = 2012;
        myBook2.numberOfCopies = 3000;
        myBook2.publisher = "Астрель";
        myBook2.displayInfo();

        Books myBook3 = new Books();
        myBook3.category = "Классика русской литературы";
        myBook3.title = "Преступление и наказание";
        myBook3.author = "Фёдор Достоевский";
        myBook3.year = 2009;
        myBook3.numberOfCopies = 2500;
        myBook3.publisher = "АСТ Москва";
        myBook3.displayInfo();

        Books myBook4 = new Books();
        myBook4.category = "Классика русской литературы";
        myBook4.title = "Идиот";
        myBook4.author = "Фёдор Достоевский";
        myBook4.year = 2010;
        myBook4.numberOfCopies = 7000;
        myBook4.publisher = "Азбука-классика";
        myBook4.displayInfo();
    }
}


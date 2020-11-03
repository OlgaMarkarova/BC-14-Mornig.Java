package day02_modul02;

import static day07.Logik01.split;

public class Books {
    String title;
    String author;
    String publishingHouse;
    int numberOfCopiesInStore;
    int numberOfCopiesSold;
    int availability;

    public Books() {

    }

    void checkStoreAvailability(int numberOfCopies, int numberOfCopiesSold) {
        availability = numberOfCopies - numberOfCopiesSold;
        System.out.println("На складе осталось: " + availability + " копий ");
        split();
    }

    public Books(String booksTitle, String booksAuthor) {
        title = booksTitle;
        author = booksAuthor;
        numberOfCopiesInStore = 2000;                   // booksCopy;
        numberOfCopiesSold = 1990;              // booksCopySold;
        publishingHouse = "АСТ";                // bookPublisher;
    }

    void displayInfo() {
        System.out.println("Название книги: " + title);
        System.out.println("Автор книги: " + author);
        System.out.println("Колличесво копий книги: " + numberOfCopiesInStore);
        System.out.println("Издательство книги: " + publishingHouse);
        split();
    }
}

class BooksTest {
    public static void main(String[] args) {
        Books book = new Books("Евгений Онегин", "Александр Пушкин");
        book.displayInfo();
        book.checkStoreAvailability(2000, 1900);

        Books myBook1 = new Books();
        myBook1.title = "Анна Каренина";
        myBook1.author = "Лев Толстой";
        myBook1.numberOfCopiesInStore = 2000;
        myBook1.numberOfCopiesSold = 1500;
        myBook1.publishingHouse = "АСТ Москва";
        myBook1.displayInfo();
        myBook1.checkStoreAvailability(2000, 1500);

        Books myBook2 = new Books();
        myBook2.title = "Мастер и Маргарита";
        myBook2.author = "Михаил Булгаков";
        myBook2.numberOfCopiesInStore = 3000;
        myBook2.publishingHouse = "Астрель";
        myBook2.displayInfo();
        myBook1.checkStoreAvailability(3000, 2500);

        Books myBook3 = new Books();
        myBook3.title = "Преступление и наказание";
        myBook3.author = "Фёдор Достоевский";
        myBook3.numberOfCopiesInStore = 2500;
        myBook3.publishingHouse = "АСТ Москва";
        myBook3.displayInfo();
        myBook1.checkStoreAvailability(2500, 2400);

        Books myBook4 = new Books();
        myBook4.title = "Идиот";
        myBook4.author = "Фёдор Достоевский";
        myBook4.numberOfCopiesInStore = 7000;
        myBook4.publishingHouse = "Азбука-классика";
        myBook4.displayInfo();
        myBook1.checkStoreAvailability(7000, 5500);
    }
}


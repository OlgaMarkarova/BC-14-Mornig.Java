
package day02_modul02;

import java.util.Arrays;

public class Books {
    private String title;
    private String author;
    private String publishingHouse;
    private int numberOfCopiesInStore;
    private int numberOfCopiesSold;
    private int availability;
    private String series;
    int yearOfPublishing;
    private String bookmark;

    public Books() {

    }

    public Books(String title, String author, String series,
                 int yearOfPublishing, String publishingHouse) {
        this.title = title;
        this.author = author;
        this.publishingHouse = publishingHouse;
        this.yearOfPublishing = yearOfPublishing;
        this.series = series;

    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishingHouse() {
        return this.publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getNumberOfCopiesInStore() {
        return this.numberOfCopiesInStore;
    }

    public void setNumberOfCopiesInStore(int numberOfCopiesInStore) {
        this.numberOfCopiesInStore = numberOfCopiesInStore;
    }

    public int getNumberOfCopiesSold() {
        return this.numberOfCopiesSold;
    }

    public void setNumberOfCopiesSold(int numberOfCopiesSold) {
        this.numberOfCopiesSold = numberOfCopiesSold;
    }

    public int getAvailability() {
        return this.availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }

    public String getSeries() {
        return this.series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public int getYearOfPublishing() {
        return this.yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getBookmark() {
        return this.bookmark = bookmark;
    }

    public void setBookmark(String newBookmark) {          // исполнение-void
        this.bookmark = newBookmark;
    }


    @Override
    public String toString() {
        return "Books {" +
                "title= '" + title + '\'' +
                // ", author='" + author + '\'' +
                // ", publishingHouse='" + publishingHouse + '\'' +
                //", availability=" + availability +
                // ", series='" + series + '\'' +
                ", yearOfPublishing= " + yearOfPublishing +
                '}';
    }
/*void displayInfo() {
        System.out.println("Название книги: " + title);
        System.out.println("Автор книги: " + author);
        System.out.println("Колличесво копий книги: " + numberOfCopiesInStore);
        System.out.println("Издательство книги: " + publishingHouse);
        System.out.println("Серия книг: " + series);
        System.out.println("Год издания: " + yearOfPublishing);
        split();
    }*/
}

class BooksTest {

    public static void main(String[] args) {
        Books myBook1 = new Books("Евгений Онегин", "Александр Пушкин", "Классика", 2015, "АСТ");
        //System.out.println(myBook1);
        //myBook1.displayInfo();

        Books myBook2 = new Books("Горе от ума", "Александр Грибоедов", "Азбука-классика", 2009, "Азбука-классика");
        //System.out.println(myBook2);
        //myBook2.displayInfo();

        Books myBook3 = new Books("Мастер и Маргарита", "Михаил Булгаков", "Русская классика", 2010, "Астрель");
        //System.out.println(myBook3);
        //myBook3.displayInfo();

        Books myBook4 = new Books("Преступление и наказание", "Фёдор Достоевский", "Классика", 2014, "АСТ Москва");
        //System.out.println(myBook4);
        //myBook4.displayInfo();

        Books myBook5 = new Books("Идиот", "Фёдор Достоевский", "Русская классика", 2012, "Азбука-классика");
        //System.out.println(myBook5);
        //myBook5.displayInfo();

        Books[] booksStore = new Books[]{myBook1, myBook2, myBook3, myBook4, myBook5};
        // System.out.print(Arrays.toString(booksStore));
        yearInsertionSort(booksStore);
        System.out.println(Arrays.toString(booksStore));
    }

    private static void yearInsertionSort(Books[] input) {
        for (int i = 0; i < input.length; i++) {
            Books temp = input[i];
            for (int j = i; j > 0; j--) {
                if (input[j].getYearOfPublishing() < input[j - 1].getYearOfPublishing()) {
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                } else if (input[j].getYearOfPublishing() > input[j - 1].getYearOfPublishing()) {
                    break;
                }
            }
        }
    }
}








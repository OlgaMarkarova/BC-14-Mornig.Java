package day03_modul02;

public class Movie {
    private String title;
    private int year;
    private String genre;

    public Movie(String title, int year, String genre) {
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {          // исполнение-void
        this.title = newTitle;                        //
    }
}

class TestMovie {
    public static void main(String[] args) {
        Movie bestFilm = new Movie("Богатые тоже плачут", 2020, "Comedy");


        System.out.println(bestFilm.getTitle());

        bestFilm.setTitle("Санта-Барбара");

        System.out.println(bestFilm.getTitle());
    }
}





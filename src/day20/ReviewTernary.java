package day20;

public class ReviewTernary {
    public static void main(String[] args) {
        //Даны два строковых значения. Верните идущее по алфавиту раньше.
        // System.out.println(myFirstCompareTo("Berlin", "Moscow"));// →"Berlin"
        /*System.out.println(myFirstCompareTo("Minsk", "Moscow"));// →"Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// →"Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// →"Могилёв"
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));
        String a = "a";
        String c = "c";
        System.out.println(a.compareTo(c));*/
        System.out.println(myFirstCompareToSecond("Berlin", "Moscow"));

    }

    private static String myFirstCompareToSecond(String firstWord, String secondWotd) {
        return (firstWord.compareTo(secondWotd) < 0) ? firstWord : secondWotd;//>0 отсортируем от меньшего
    }

    private static String myFirstCompareTo(String firstWord, String secondWord) {
        if (firstWord.compareTo(secondWord) < 0) {
            return firstWord;
        } else
            return secondWord;
    }
}

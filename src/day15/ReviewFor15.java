package day15;

public class ReviewFor15 {
    public static void main(String[] args) {
        //Буква "я" воистину великая буква.
        // определите содержание этой буквы в слове.
        System.out.println(chekCyrillicLetterInWord("Василий"));
        System.out.println(chekCyrillicLetterInWord("Семен"));
        System.out.println(chekCyrillicLetterInWord("Яна"));
        System.out.println(chekCyrillicLetterInWord("яблоко"));
        //Реализовать метод,
    }

    private static boolean chekCyrillicLetterInWord(String word) {
        if (word.toLowerCase().contains("я")) {
            return true;
        }
        String input = word.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'я') {
                return true;
            }
        }
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'я' || word.charAt(i) == 'Я') {
                return true;
            }
        }
        return false;
    }
}

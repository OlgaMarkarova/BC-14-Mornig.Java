package day16;

public class RevieFor16 {
    public static void main(String[] args) {
        //Буква "я" воистину великая буква.
        // определите содержание этой буквы в слове.
        String word1 = "Я люблю Ярославль";
        String word2 = "Я люблю Берлин";
        String word3 = "Никто не любит тебю";
        String all = word1 + word2 + word3;
        System.out.println(countYa(word1));
        System.out.println(countYa(word2));
        System.out.println(countYa(word3));

    }

    private static int countYa(String input) {
        String str = input.toLowerCase();
        char ya = 'я';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ya) {
                count++;
            }

        }
        return count;
    }
}

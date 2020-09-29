package day15;

public class CWfile5_15 {
    public static void main(String[] args) {
        //Написать свой метод проверки строки на палиндром.
        //Учесть, что палиндром может быть предложением с пробелами. При решении задачи используйте цикл.
        //Нельзя использовать методы replace(), reverse() и конструкции, которые вы не учили.

        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// ->true
        System.out.println(checkPalindrom("поп"));// ->true
        System.out.println(checkPalindrom("школа"));// ->false
    }

    private static boolean checkPalindrom(String str) {
        String input = "";
        // удаляем пробелы
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
            }
        }
        input = input.toLowerCase();
        String strReverse = "";
        System.out.println(input);
        // перевернули фразу
        for (int i = input.length() - 1; i >= 0; i--) {
            strReverse += input.charAt(i);
        }
        System.out.println(strReverse);

        // сравниваем посимвольно оригинальную строку и перевернутую.
        for (int i = 0; i < input.length(); i++) {
            if (strReverse.charAt(i) != input.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

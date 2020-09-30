package day15;

public class HW15PalindromRub {
    public static void main(String[] args) {
        printSumInRub(1, 35);

        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// ->true
        System.out.println(checkPalindrom("поп"));// ->true
        System.out.println(checkPalindrom("школа"));// ->false

    }

    private static String removeTheSpace(String str) {
        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
                input = input.toLowerCase();
            }
        }
        //System.out.println(input);
        return input;
    }

    private static String turnOver(String input) {
        String strReverse = "";
        System.out.println(input);
        for (int i = input.length() - 1; i >= 0; i--) {
            strReverse += input.charAt(i);
        }
        System.out.println(strReverse);
        return strReverse;
    }
    private static boolean checkPalindrom(String str) {
        String input = removeTheSpace(str);
        String strReverse = turnOver(input);
        for (int i = 0; i < input.length(); i++) {
            if (strReverse.charAt(i) != input.charAt(i)) {
                return false;
            }
        }

        return true;
    }
    private static void printSumInRub(int a, int b) {
        for (int i = a; i <= b; i++) {
            System.out.println(i + " " + rightWordInRussian(i));
        }
    }

    private static String rightWordInRussian(int number) {
        String output = "";
        String input = String.valueOf(number);
        String lastSymbol = "" + input.charAt(input.length() - 1);
        int lastDigit = Integer.parseInt(lastSymbol);
        if (number > 10 && number < 15 || lastDigit >= 5 || lastDigit == 0) {
            output = "рублей";
        } else if (lastDigit == 1) {
            output = "рубль";
        } else {
            output = "рубля";
        }
        return output;
    }
}


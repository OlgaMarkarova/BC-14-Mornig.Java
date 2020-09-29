package day15;

public class CWother {
    public static void main(String[] args) {
        System.out.println(checkPalindrom("А роза упала на лапу Азора"));// ->true
        System.out.println(checkPalindrom("поп"));// ->true
        System.out.println(checkPalindrom("школа"));// ->false
        removeTheSpace("А роза упала на лапу Азора");
        removeTheSpace("поп");
        removeTheSpace("школа");
    }



        private static String removeTheSpace(String str) {
        String input = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                input += str.charAt(i);
                input = input.toLowerCase();
            }
        }
        System.out.println(input);
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
 }


package day27;

import static day07.Logik01.split;

public class HWString {
    public static void main(String[] args) {
        System.out.println(doubleChar("The"));// → "TThhee"
        System.out.println(doubleChar("AAbb"));// → "AAAAbbbb"
        System.out.println(doubleChar("Hi-There"));// → "HHii--TThheerree"
        split();

    }

    private static String doubleChar(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
        }
        return result;
    }
}

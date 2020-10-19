package day28;

import static day07.Logik01.split;

public class StringTask {
    public static void main(String[] args) {
        System.out.println("файл 14, задача 14");

        System.out.println(plusOut("12xy34", "xy"));// → "++xy++"
        System.out.println(plusOut("12xy34", "1"));// → "1+++++"
        System.out.println(plusOut("12xy34xyabcxy", "xy"));// → "++xy++xy+++xy"
        split();

        System.out.println("файл 14, задача 13");

        System.out.println(oneTwo("abc"));// →"bca"
        System.out.println(oneTwo("tca"));// →"cat"
        System.out.println(oneTwo("tcagdo"));// →"catdog"
        split();

        System.out.println("файл 14, задача 13");
        System.out.println(repeatFront("Chocolate", 4));// →"ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3));// →"ChoChC"
        System.out.println(repeatFront("Ice Cream", 2));// →"IcI"
        split();

        System.out.println("файл 14, задача 7");

        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"
        split();

        System.out.println("файл 14, задача 6");

        //Returns true if for every '*' (star) in the string,
        //if there are chars both immediately before and after the star, they are the same.

        System.out.println(sameStarChar("xy*yzz")); //→ true
        System.out.println(sameStarChar("xy*zzz")); //→ false
        System.out.println(sameStarChar("*xa*az")); //→ false
        split();

        System.out.println("файл 14, задача 7");

        System.out.println(wordEnds("abcXY123XYijk", "XY"));// → "c13i"
        System.out.println(wordEnds("XY123XY", "XY"));// → "13"
        System.out.println(wordEnds("XY1XY", "XY"));// → "11"

    }
    private static String wordEnds(String str1, String wordStr) {
        String output = "";
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == wordStr.charAt(0) && str1.charAt(i + 1) == wordStr.charAt(1)) {
                if (i > 0) {
                    output = output + str1.charAt(i - 1);
                }
                if (i < str1.length() - 3) {
                    output = output + str1.charAt(i + 2);
                }
            }
        }
        return output;
    }
    private static boolean sameStarChar(String input) {
        char star = '*';
        for (int i = 0; i < input.length(); i++) {
            if ((i == 0 || i == input.length() - 1) && input.charAt(i) == star) {
                return false;
            } else if (input.charAt(i) == star
                    && input.charAt(i - 1) != input.charAt(i + 1)) {
                return false;

            }
        }
        return true;
    }

    private static String starOut(String input) {
        String output = "";
        char star = '*';
        int x1 = input.indexOf(star);
        int x2 = input.lastIndexOf(star);
        output = input.substring(0, input.indexOf(star) - 1) + input.substring(input.lastIndexOf(star) + 2);
        return output;
    }


    private static String repeatFront(String input, int number) {
        String output = "";
        int count = number;
        for (int i = 0; i < number; i++) {
            //System.out.println("test" + i+ output);
            output += input.substring(0, count--);
        }
        return output;
    }

    private static String plusOut(String str, String xy) {

        String result = "";
        String plus = "+";
        int count = 0;
        String input = str;
        for (int i = 0; i < str.length(); i++) {
            if (i == input.indexOf(xy) + count) {
                result += str.substring(i, i + xy.length());
                i += xy.length() - 1;
                count += input.indexOf(xy) + xy.length();
                input = input.substring(input.indexOf(xy) + xy.length());
            } else {
                result += plus;
            }
        }
        return result;
    }

    private static String oneTwo(String input) {
        String result = "";
        for (int i = 0; i < input.length() - 2; i += 3) {
            System.out.println("i= " + i);
            result += input.substring(i + 1, i + 3) + input.charAt(i);
        }
        // String str = input.substring(0, 3);
        return result;
    }

}

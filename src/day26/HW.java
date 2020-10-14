package day26;

public class HW {
    public static void main(String[] args) {
        //Возвращает количество раз, когда строка "hi" появляется в любом месте данной строки.
        System.out.println(countHi("abc hi ho"));// → 1
        System.out.println(countHi("ABChi hi"));// → 2
        System.out.println(countHi("hihi"));// → 2

        //Получив две строки, верните true, если одна из них появляется в самом конце другой строки,
        // игнорируя верхний/нижний регистр
        //различия (другими словами, вычисление не должно быть "чувствительным к регистру").
        //Замечание: str.toLowerCase() возвращает строчный регистр
        //версия строки.

        System.out.println(endOther("Hiabc", "abc"));// → true
        System.out.println(endOther("AbC", "HiaBc"));// → true
        System.out.println(endOther("abc", "abXabc"));// → true
        System.out.println(endOther("abcZ", "abXabc"));// → false

        //We'll say that a String is xy-balanced if for all the 'x'
        // chars in the string, there exists a 'y' char somewhere later in the string.
        //So "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's.
        // Return true if the given string is xy-balanced.

        System.out.println(xyBalance("aaxbby"));// → true
        System.out.println(xyBalance("aaxbb"));// → false
        System.out.println(xyBalance("yaaxbb"));// → false
    }

    private static boolean xyBalance(String input) {
        /*int result = 0;
        char a = 'x';
        char b = 'y';
        for (int i = input.length(); i == 0; i--) {
            if (input.charAt(i) == b) {
                System.out.println("test" + i);
                {
                    result = 1;
                }
                if (input.charAt(i) == a && result == 1)
                    System.out.println("String balanced");
            }
        }
        return false;*/

        int x=input.lastIndexOf('x');
        int y=input.lastIndexOf('y');


        return false;
        //int numberX = 0;
        //        int numberY = 0;
        //        char symbX = 'x';
        //        char symbY = 'y';
        //        for (int i = 0; i < str.length(); i++) {
        //            if (str.charAt(i) == symbX) {
        //                numberX++;
        //            }
        //            if (str.charAt(i) == symbY && numberX != 0) {
        //                numberY++;
        //            }
    }



    private static boolean endOther(String input, String input1) {
        String str = input.toLowerCase();
        String str1 = input1.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str1.charAt(str1.length() - 1)) {
                return true;
            }
        }
        return false;
        //private static boolean endOther(String str, String searchStr) {
        //        String inputStr = str.toLowerCase();
        //        String inputSearch = searchStr.toLowerCase();
        //        return (inputStr.endsWith(inputSearch) || inputSearch.endsWith(inputStr));
        //    }
    }

    private static int countHi(String input) {
        int count = 0;
        char a1 = 'h';
        char a2 = 'i';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == a1 && input.charAt(i + 1) == a2) {
                count++;
            }
        }
        return count;
    }
}

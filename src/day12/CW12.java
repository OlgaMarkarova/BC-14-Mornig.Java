package day12;

public class CW12 {
    public static void main(String[] args) {
        //Даны 2 int, a и b, верните их сумму.
        //Однако «подростковые» значения в диапазоне 13..19 включительно оказываются более удачными.
        //Поэтому, если одно из значений - подросток, просто верните 19.

        //System.out.println(teenSum(3, 4));// → 7
        //System.out.println(teenSum(10, 13));// → 19
        //System.out.println(teenSum(13, 2));// → 19

        //Дан String str
        //Если String начинается с "f", то возвращается "Fizz".
        //Если String заканчивается на "b", возвращается "Buzz".
        //Если оба условия "f" и "b" верны, возвращаем "FizzBuzz".
        //Во всех остальных случаях возвращайте String без изменений. (См. также: FizzBuzz Code).

        //System.out.println(fizzString("fig"));// →"Fizz"
        //System.out.println(fizzString("dib"));// →"Buzz"
        //System.out.println(fizzString("fib"));// →"FizzBuzz"

        //даны три int, a b c, возвращается true, если b больше a, и c больше b.
        //Однако, за исключением того, что если "bOk" верно, b не должно быть больше a.

        System.out.println(inOrder(1, 2, 4, false));// → true
        System.out.println(inOrder(1, 2, 1, false));// → false
        System.out.println(inOrder(1, 1, 2, true));// → true

        //Получив string, верните string длиной 1 спереди,
        // если спереди нет ложного срабатывания,
        // в этом случае верните строку длиной 1 сзади. Строка будет непустой.
        System.out.println(theEnd("Hello", true));// →"H"
        System.out.println(theEnd("Hello", false));// →"o"
        System.out.println(theEnd("oh", true));// →"o"

        //Получив string, верните true, если она заканчивается на "ly".
        System.out.println(endsLy("oddly"));// →true
        System.out.println(endsLy("y"));// →false
        System.out.println(endsLy("oddy"));// →false

        //Учитывая 2 string, a и b, возвращаем новую string,
        // сделанную из первого символа а и последнего символа b,
        // так что "yo" и "java" дают "ya".
        // Если любая из строк имеет длину 0, используйте '@' для отсутствующего char.

        System.out.println(lastChars("last", "chars"));// →"ls"
        System.out.println(lastChars("yo", "java"));// →"ya"
        System.out.println(lastChars("hi", ""));// →"h@"

        //Если string начинается с "red" или "blue",
        //возвращаем цвет string, в противном случае возвращаем пустую string.

        System.out.println(seeColor("redxx"));// →"red"
        System.out.println(seeColor("xxred"));// →""
        System.out.println(seeColor("blueTimes"));// →"blue"

        //Получив string, верните новую string,
        //сделанную из 3 копий первых 2-х char исходной строки.
        //string может быть любой длины.
        //Если их меньше 2-х, используйте все, что есть.

        System.out.println(extraFront("Hello"));// →"HeHeHe"
        System.out.println(extraFront("ab"));// →"ababab"
        System.out.println(extraFront("H"));// →"HHH"

        //Получив string и вторую "word" string, скажем,
        // что слово совпадает со string, если оно появляется в первом char string,
        // за исключением того, что первый char не обязательно должен точно совпадать.
        // При совпадении верните переднюю часть string,
        // либо в противном случае верните пустую строку.
        // Итак, при использовании string "hippo" word "hi" возвращает "hi", а "xip" - "hip".
        // Слово будет как минимум длиной 1.

        //System.out.println(startWord("hippo", "hi"));// →"hi"
        //System.out.println(startWord("hippo", "xip"));// →"hip"
        //System.out.println(startWord("hippo", "i"));// →"h"
        //System.out.println(startWord("dippo", "hip"));// →"dip"

        //Получив string, верните новую string, с
        //деланную из 3 копий последних 2-х char исходной string.
        //Длина string будет как минимум 2.

        //System.out.println(extraEnd("Hello"));// →"lololo"
        //System.out.println(extraEnd("ab"));// →"ababab"
        //System.out.println(extraEnd("Hi"));// →"HiHiHi"

        //Given a string, return a version without the first and last char,
        // so "Hello" yields "ell". The string length will be at least 2.

        //System.out.println(withoutEnd("Hello"));// →"ell"
        //System.out.println(withoutEnd("java"));// →"av"
        //System.out.println(withoutEnd("coding"));// →"odin"

        //Given a string, return a "rotated left 2" 
        // version where the first 2 chars are moved to the end. 
        //The string length will be at least 2.

        //System.out.println(left2("Hello"));// →"lloHe"
        //System.out.println(left2("java"));// →"vaja"
        //System.out.println(left2("Hi"));// →"Hi"

        //Given an int n, return the absolute difference between n and 21,
        // except return double the absolute difference if n is over 21.

        //System.out.println(diff21(19));// → 2
        //System.out.println(diff21(10));//→ 11
        //System.out.println(diff21(21));// → 0
        //System.out.println(diff21(25));// → 8

        //Given an int n, return true if it is within 10 of 100 or 200.
        // Note: Math.abs(num) computes the absolute value of a number.

        //System.out.println(nearHundred(93));// → true
        //System.out.println(nearHundred(90));// → true
        //System.out.println(nearHundred(89));// → false
    }

    private static boolean nearHundred(int n) {
        return (Math.abs(n - 10)) <= 10 || Math.abs(n - 200) <= 10;
    }

    private static int diff21(int n) {
        if (n > 21) {
            return 2 * (n - 21);
        } else
            return 21 - n;
    }

    private static String left2(String str) {
        return str.substring(2) + str.substring(0, 2);
    }

    private static String withoutEnd(String str) {
        return str.substring(1, str.length() - 1);
    }

    private static String extraEnd(String str) {
        String temp = str.substring(str.length() - 2);
        return temp + temp + temp;
    }

    private static String startWord(String str, String word) {
        /* if (str.startsWith(word)) {
            return word;*/
        if (str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0, 1) + word.substring(1);
        } else {
            return str.substring(0, 1);
        }
    }

    private static String extraFront(String str) {
        if (str.length() < 2) {
            return str + str + str;
        } else {
            return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
        }
    }

    private static String seeColor(String str) {
        if (str.startsWith("red")) {
            return "red";
        } else if (str.substring(0, 4).equals("blue")) {
            return "blue";
        } else {
            return "";
        }
    }

    private static String lastChars(String a, String b) {
        if (a.length() == 0) {
            a = "@";
        }
        if (b.length() == 0) {
            b = "@";
        }
        return a.charAt(0) + b.substring(b.length() - 1);
    }

    private static String middleThree(String candy) {

        return "";
    }


    private static boolean endsLy(String str) {
        return str.endsWith("ly");
    }

    private static String theEnd(String str, boolean b) {
        if (b) {
            return str.substring(0, 1);
        } else {
            return str.substring(str.length() - 1);
        }
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        //  return bOK && c > b || b > a && c > b;
        if (b > a && c > b) {
            return true;
        } else if (bOk && b <= a) {
            return true;
        }
        return false;
    }


    private static String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) {
            return "FizzBuzz";
        } else if (str.startsWith("f")) {
            return "Fizz";
        } else if (str.endsWith("b")) {
            return "Buzz";
        } else return "str";
    }

    private static int teenSum(int a, int b) {
        int sum = a + b;
        if ((a >= 13 && a <= 19) || (b <= 19 && b >= 13)) {
            return 19;
        } else
            return sum;
    }
}

package day34;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import static day07.Logik01.split;

public class String13 {
    public static void main(String[] args) {
        System.out.println("String13_19");
        //Получив две строки, сложите их вместе (так называемое «конкатенация») и верните результат.
        //Однако, если конкатенация создает двойной символ,
        //опустите один из символов, поэтому «abc» и «cat» дают «abcat».
        System.out.println(conCat("abc", "cat"));//   →"abcat"
        System.out.println(conCat("dog", "cat"));// →"dogcat"
        System.out.println(conCat("abc", ""));// →"abc"
        System.out.println(conCat("dog", "grt"));// →"dogrt"
        split();

        System.out.println("String13_20");
        System.out.println(frontAgain("edited"));// →true
        System.out.println(frontAgain("edit"));// →false
        System.out.println(frontAgain("ed"));// →true
        System.out.println(frontAgain("ed"));// →true
        split();
        System.out.println("String13_21");
        //Для данной строки, если подстрока длиной 2 появляется как в ее начале,
        //так и в конце, вернуть строку без подстроки в начале,
        //поэтому «HelloHe» дает «lloHe».
        //Подстрока может перекрываться сама с собой, поэтому «Hi» дает «».
        //В противном случае вернуть исходную строку без изменений.
        System.out.println(without2("HelloHe"));//  →"lloHe"
        System.out.println(without2("HelloHi"));// →"HelloHi"
        System.out.println(without2("Hi"));// →""
        split();

        System.out.println("String13_22");
        //Для данной строки, если первым или последним символом является 'x',
        //вернуть строку без этих символов 'x',
        //а в противном случае вернуть строку без изменений.
        System.out.println(withoutX("xHix"));// →"Hi"
        System.out.println(withoutX("xHi"));// →"Hi"
        System.out.println(withoutX("Hxix"));// →"Hxi
        split();
        System.out.println("String13_23");
        //Интернет построен с помощью строк HTML, таких как «Yay»,
        //которые выделяют Yay курсивом. В этом примере тег «i» образует и окружает слово «Yay».
        //Даны String tag и word, создайте строку HTML с тегами вокруг слова, например "Уay".
        System.out.println(makeTags("i", "Yay"));// → "<i>Yay</i>"
        System.out.println(makeTags("i", "Hello"));// → "<i>Hello</i>"
        System.out.println(makeTags("cite", "Yay"));// → "<cite>Yay</cite>"
        split();

        System.out.println("String13_24");
        //Дан String вернуть String, состоящую из первых двух char,
        //так что String «Hello» дает «He». Если String короче 2,
        //вернуть все, что есть, так что «X» дает «X», а пустая String «» дает пустую строку «».
        //Обратите внимание, что str. Length () возвращает длину строки.
        System.out.println(firstTwo("Hello"));// →"He"
        System.out.println(firstTwo("abcdefg"));// →"ab"
        System.out.println(firstTwo("ab"));// →"ab"
        System.out.println(firstTwo(""));// →""
        System.out.println(firstTwo("a"));// →"a"
        split();

        System.out.println("String13_25");
        //Given 2 strings, a and b, return a string of the form short+long+short,
        //with the shorter string on the outside and the longer string on the inside.
        //The strings will not be the same length, but they may be empty (length 0).
        //
        System.out.println(comboString("Hello", "hi"));// →"hiHellohi"
        System.out.println(comboString("hi", "Hello"));// →"hiHellohi"
        System.out.println(comboString("aaa", "b"));// →"baaab"
        split();

        System.out.println("String13_26");
        //Дан String вернуть версию «повернутые вправо 2»,
        //в которой последние 2 char перемещены в начало.
        //Длина String будет не менее 2.
        System.out.println(right2("Hello"));// →"loHel"
        System.out.println(right2("java"));// →"vaja"
        System.out.println(right2("Hi"));// →"Hi"
        split();

        System.out.println("String13_27");
        //Given a string of even length, return a string made of the middle two chars,
        //so the string "string" yields "ri".
        //The string length will be at least 2.
        System.out.println(middleTwo("string"));// →"ri"
        System.out.println(middleTwo("code"));// →"od"
        System.out.println(middleTwo("Practice"));// →"ct"
        split();

        System.out.println("String13_28");
        //Даны String и index, верните String длиной 2, начиная с данного index.
        //Если index слишком велик или слишком мал для определения длины String 2,
        //используйте первые 2 char.
        //Длина String будет не менее 2.
        System.out.println(twoChar("java", 0)); //→"ja"
        System.out.println(twoChar("java", 2));// →"va"
        System.out.println(twoChar("java", 3));// →"ja"
        System.out.println(twoChar("jav", 3));// →"ja"
        split();

        System.out.println("String13_29");
        //Given a string, return a string length 2 made of its first 2 chars.
        //If the string length is less than 2, use '@' for the missing chars
        System.out.println(atFirst("hello"));// →"he"
        System.out.println(atFirst("hi"));// →"hi"
        System.out.println(atFirst("h"));// →"h@"
        split();

        System.out.println("String13_30");
        //Дан String любой длины, верните новую String, в которой последние 2 char,
        //если они есть, поменяны местами, поэтому «coding» дает «codign».
        System.out.println(lastTwo("coding"));// →"codign"
        System.out.println(lastTwo("cat"));// →"cta"
        System.out.println(lastTwo("ab"));// →"ba"
        split();

        System.out.println("String13_31");
        //Даны два String, сложите их вместе
        //(так называемое «конкатенация») и верните результат.
        //Однако, если String имеют разную длину,
        //с char из более длинной String, чтобы она была такой же длины,
        //как и более короткая String.
        //Таким образом, «Hello» и «Hi» дают «loHi». Струны могут быть любой длины.
        System.out.println(minCat("Hello", "Hi"));// →"loHi"
        System.out.println(minCat("Hello", "java"));// →"ellojava"
        System.out.println(minCat("java", "Hello"));// →"javaello"
        split();

        System.out.println("String13_32");
        //Дан String вернуть версию без первых двух char.
        //За исключением того, что оставьте первый char, если это 'a',
        //и оставьте второй char, если это 'b'.
        //String может быть любой длины. 
        System.out.println(deFront("Hello"));// →"llo"
        System.out.println(deFront("java"));// →"va"
        System.out.println(deFront("away"));// →"aay"
        split();

        System.out.println("String13_33");
        //Дан String, если один или оба из первых двух char имеют значение «x», 
        //вернуть String без этих char «x», 
        //а в противном случае вернуть String без изменений.
        System.out.println(withoutX2("xHi"));// →"Hi"
        System.out.println(withoutX2("Hxi"));// →"Hi"
        System.out.println(withoutX2("Hi"));// →"Hi"
        split();

        System.out.println("String13_18");
        //Дан String верните true, если "bad" появляется,
        //начиная с индекса 0 или 1 в String, например,
        //с "badxxx" или "xbadxx", но не с "xxbadxx". Строка может быть любой длины, включая 0.
        //Примечание: используйте .equals () для сравнения двух String.
        System.out.println(hasBad("badxx"));// → true
        System.out.println(hasBad("xbadxx"));// → true
        System.out.println(hasBad("xxbadxx"));// → false
        split();

        System.out.println("String13_17");
        //Given a string and an int n, return a string made of the first
        //and last n chars from the string.
        //The string length will be at least n.
        System.out.println(nTwice("Hello", 2));// →"Helo"
        System.out.println(nTwice("Chocolate", 3));// →"Choate"
        System.out.println(nTwice("Chocolate", 1));// →"Ce"
        System.out.println(nTwice("Chocolate", 4));// →"Choclate"
    }

    private static String nTwice(String str, int n) {
        String output = "";
        output= str.substring(0,n)+str.substring(str.length()-n);  //str.replace
        return output;
    }

    private static boolean hasBad(String input) {
        String output = "";
        String index = "bad";
        if (input.startsWith(index) || input.substring(1).startsWith(index)) {
            return true;
        }

        return false;
    }

    private static String withoutX2(String str) {
        String output = "";
        char x = 'x';
        /*if (str.startsWith("x")) {
            output = str.substring(1);*/
        if (str.charAt(0) == x) {
            output = str.substring(1);
        } else if (str.charAt(1) == x) {
            output = str.charAt(0) + str.substring(str.length() - 1);
        } else output = str;
        return output;
    }

    private static String deFront(String str) {
        String output = "";
        int outputLength = 2;
        char a = 'a';
        char b = 'b';
        output = str.substring(outputLength);
        if (str.charAt(0) == a) {
            output = str.charAt(0) + str.substring(outputLength);
        }
        return output;
    }

    private static String minCat(String str, String str1) {
        String output = "";
        int lengthOutputMin = 0;
        if (str1.length() < str.length()) {
            lengthOutputMin = str.length() - str1.length();
            output = str.substring(lengthOutputMin) + str1;
        }
        if (str.length() < str1.length()) {
            lengthOutputMin = str1.length() - str.length();
            output = str + str1.substring(lengthOutputMin);
        }
        return output;
    }

    private static String lastTwo(String input) {
        String output = "";
        output = input.substring(0, input.length() - 2)
                + input.charAt(input.length() - 1) + input.charAt(input.length() - 2);
        return output;
    }

    private static String atFirst(String input) {
        String output = "";
        int lengthOutput = 2;
        char mist = '@';
        if (input.length() >= lengthOutput) {
            output = input.substring(0, 2);
        }
        if (input.length() < lengthOutput) {
            output = input + mist;
        }
        return output;
    }

    private static String twoChar(String input, int index) {
        String output = "";
        int lengthOutput = 2;
        if (index <= lengthOutput) {
            output = input.substring(index, index + lengthOutput);
        } else
            output = input.substring(0, lengthOutput);

        return output;
    }

    private static String middleTwo(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (i == input.length() / 2) {
                output = input.substring(i - 1, i + 1);
            }
        }
        return output;
    }

    private static String right2(String input) {
        String output = "";
        output = input.substring((input.length() - 2)) + input.substring(0, input.length() - 2);
        return output;
    }

    private static String comboString(String a, String b) {
        String output = "";
        if (a.length() > b.length()) {
            output = b.concat(a).concat(b);//b+a+b
        }
        if (b.length() > a.length()) {
            output = a.concat(b).concat(a);//a + b + a;
        }
        return output;
    }

    private static String firstTwo(String input) {
        String output = "";
        if (input.length() < 2) {
            return input;
        }
        output = input.substring(0, 2);
        return output;
    }

    private static String makeTags(String tag, String word) {
        String output = "";
        char a = '<';
        char b = '>';
        char c = '/';
        output = a + tag + b + word + a + c + tag + b;
        return output;
    }

    private static String withoutX(String input) {
        String output = "";
        char x = 'x';
        if (input.endsWith("x")) {     //input.charAt(input.length() - 1) == x) {
            output = input.substring(0, input.length() - 1);
        }
        if (input.startsWith("x")) { //charAt(0) == x) {
            output = input.substring(1);
        }
        if (input.endsWith("x") /*charAt(input.length() - 1) == x*/
                && input.startsWith("x")/*charAt(0) == x*/) {
            output = input.substring(1, input.length() - 1);
        }
        return output;
    }

    private static String without2(String str) {
        //HelloHe"→"lloHe", "HelloHi" →"HelloHi", "Hi"→""
        String output = "";
        if (str.charAt(0) == str.charAt(str.length() - 2)
                && str.charAt(1) == str.charAt(str.length() - 1)) {
            output = str.substring(2);
            return output;
        }
        return str;

    }
        /*String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(str.length() - 2)
                    && str.charAt(i + 1) == str.charAt(str.length() - 1)) {
                output = str.substring(i + 2);
                return output;
            }
            return str;
        }*/


    private static boolean frontAgain(String str) {
        if (str.charAt(str.length() - 1) == str.charAt(1)) {
            return true;
        }
        return false;
    }

    private static String conCat(String str1, String str2) {
        String output = "";
        output = str1 + str2;
        if (str2.length() == 0) output = str1;
        else if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            output = str1 + str2.substring(1);
            //System.out.println("str1_1 " + (str1.substring(0)));
            //System.out.println("str2_1 " + (str2.substring(1)));
        }

        return output;
    }
}


package day17;

public class CW14_1 {
    public static void main(String[] args) {
        //Given a string, return a string where for every char in the original, there are two chars.

        //System.out.println(doubleChar("The"));// →"TThhee"
        //System.out.println(doubleChar("AAbb"));// →"AAAAbbbb"
        //System.out.println(doubleChar("Hi-There"));// →"HHii--TThheerree"

        //Return the number of times that the string "code" appears anywhere in
        //the given string, except we'll accept any letter for the 'd', so "cope" and "cooe" count.
        //Return количество раз, когда String "code" появляется в любом месте данной String,
        //за исключением того, что мы примем любую букву для 'd', так что "cope" и "cooe" считается.

        //System.out.println(countCode("aaacodebbb"));// →1
        //System.out.println(countCode("codexxcode"));// →2
        //System.out.println(countCode("cozexxcope"));// →2

        //Возвращает true, если заданная String содержит "bob",
        // но где средний 'o' char может быть любым char.

        System.out.println(bobThere("abcbob"));// →true
        System.out.println(bobThere("b9b"));// →true
        System.out.println(bobThere("bac"));// →false

        //Получив String и int n, верните String,
        //состоящую из n повторений последних n символов строки.
        //Можно предположить, что n находится между 0 и длиной строки, включительно.
        System.out.println(repeatEnd("Hello", 3));// →"llollollo"
        System.out.println(repeatEnd("Hello", 2));// →"lolo"
        System.out.println(repeatEnd("Hello", 1));// →"o"

        //Получив string, рассмотрим prefix string, сделанную из первых N символов string.
        // Появляется ли эта prefix string Предположим,
        // что string не пустая и что N находится в диапазоне 1...str.length().
        System.out.println(prefixAgain("abXYabc", 1));// →true
        System.out.println(prefixAgain("abXYabc", 2));// →true
        System.out.println(prefixAgain("abXYabc", 3));// →false
    }

    private static boolean prefixAgain(String input, int N) {
        return false;
    }

    private static String repeatEnd(String input, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output += input.substring(input.length() - n);

        }
        return output;
    }

    private static boolean bobThere(String input) {
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'b' && input.charAt(i + 2) == 'b') {
                return true;
            }

        }
        return false;
    }

    private static int countCode(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'c' && input.charAt(i + 1) == 'o' && input.charAt(i + 3) == 'e') {
                count++;
            }

        }

        return count;
    }

    private static String doubleChar(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            //output += input.charAt(i) + input.charAt(i); //+= не соблюдает очередность в String
            output = output + input.charAt(i) + input.charAt(i);
        }
        return output;
    }
}

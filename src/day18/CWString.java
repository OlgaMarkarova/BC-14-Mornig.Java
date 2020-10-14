package day18;

public class CWString {
    public static void main(String[] args) {
        //Дан string, рассмотрим prefix string, сделанную из первых N символов строки.
        //Появляется ли эта prefix string где-то еще в строке?
        //Предположим, что string не пустая и что N находится в диапазоне 1...str.length().
        System.out.println(prefixAgain("abXYabc", 1));// →true
        System.out.println(prefixAgain("abXYabc", 2));// →true
        System.out.println(prefixAgain("abXYabc", 3));// →false
    }

    private static boolean prefixAgain(String abXYabc, int i) {

        return false;
    }
}

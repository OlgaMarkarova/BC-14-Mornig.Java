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

    private static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i < str.length(); i++) {
            if (n + i <= str.length()) {
                if (prefix.equals(str.substring(i, n + i))) {
                    return true;
                }
            }
        }
        return false;
    }
}

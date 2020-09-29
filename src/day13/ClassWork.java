package day13;

public class ClassWork {
    public static void main(String[] args) {
        //myCharAt();
        myCoddePoint();
        //myCodePointBefore();
        //mycodePointCount();
        //myCompareTo();
        //
        //myCompareToIgnoreCase();
        //myTrim();

    }

    private static void myTrim() {
        String test = " - Я памятник себе воздвиг нерукотворный - ";
        System.out.println(test);
        System.out.println(test.trim());
        // обрезает пробелы вначале и вконце строки.
    }

    private static void myCompareToIgnoreCase() {
        String str1 = "МОСКВА";
        String str2 = "москва";
        String str3 = "Z";
        int result1 = str1.compareToIgnoreCase(str2);
        int result2= str2.compareToIgnoreCase(str3);
        int result3= str2.compareToIgnoreCase(str1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static void myCompareTo() {
        String str1 = "A";
        String str2 = "B";
        String str3 = "Z";
        int result1 = str1.compareTo(str2);
        int result2= str2.compareTo(str3);
        int result3= str2.compareTo(str1);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    private static void myCharAt() {
        String hausmaster ="Василий";
        int size = hausmaster.length();
        System.out.println(hausmaster.charAt(4));
        System.out.println(hausmaster.charAt(size-1));
        String output
                = ""+hausmaster.charAt(0)
                + hausmaster.charAt(size-1);
        System.out.println(output);
    }

    private static void mycodePointCount() {
        String str = "I LOVE JAVA";
        int count = str.codePointCount(2,5);
        System.out.println(count);

    }

    private static void myCodePointBefore() {
        String str="I LOVE JAVA";
        System.out.println(str);
        System.out.println(str.codePointBefore(1));
    }

    private static void myCoddePoint() {
        String hm = "Василий";
        int test = hm.codePointAt(1);
        System.out.println(test);
    }
}

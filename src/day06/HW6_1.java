package day06;

public class HW6_1 {
    public static void main(String[] args) {
        System.out.println(lastChars("last", "chars"));
        System.out.println(lastChars("yo", " java"));

        System.out.println(makeAbba("Hi", "Bye"));
        System.out.println(makeAbba("Yo", "Alice"));
        System.out.println(makeAbba("What", "Up"));

    }


    private static String makeAbba(String c1, String c2) {
        String itog1 = c1.substring(0) + c2.substring(0) + c2.substring(0) + c1.substring(0);
        return itog1;
    }

    private static String lastChars(String s1, String s2) {
        String result = s1.substring(0, 1) + s2.substring(s2.length()-1);
        return result;
    }
}

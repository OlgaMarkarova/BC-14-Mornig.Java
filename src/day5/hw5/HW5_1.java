package day5.hw5;

public class HW5_1 {
    public static void main(String[] args) {

        String s1 = "Olga"; // String Olga
        String s2 = "Markarova"; // String Markarova
        String s3 = "Berlin";
        String s4 = "12207";
        String s5 = "Celsiusstraße 52";

        System.out.println(HelloName(s1));
        System.out.println(HelloName(s2));
        System.out.println(HelloName(s3));
        System.out.println(HelloName(s4));
        System.out.println(HelloName(s5));

        concatenation();
    }

    private static void concatenation() {
        // char s6 = '"'; //
        char s6 = '\u0022';
        char s7 = 34;


        System.out.println(s6 + "Olga Markarova - " + "Sales Manager" + s7);
    }

    public static String HelloName(String userName) {
        return userName;
    }
}

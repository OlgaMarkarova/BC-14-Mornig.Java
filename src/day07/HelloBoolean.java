package day07;

public class HelloBoolean {
    public static void main(String[] args) {

        // introduktionBoolean();
        introduktionBoolean3();

        boolean a = true;
        boolean b, c;
        b = false;

        c = a & b;
        c = a | b;
        c = a ^ b;
        c = a != b;
        System.out.println("a & b: " + c);
        System.out.println("a | b: " + c);
        System.out.println("a ^ b: " + c);
        System.out.println("a != b: " + c);
    }
    private static void introduktionBoolean3() {
        boolean a = (7 + 8) * 5 > 7 + 8 * 5;
        System.out.println(a);
        boolean b = (7 + 8) * 4 != 7 + 4 * 5;
        System.out.println(b);
        boolean c = 3 + 4 > 99 + 1 & 16 - 5 > 3 * 4;
        System.out.println(c);
        boolean e = !(3 * 4 < 7 + 8);
        System.out.println(e);
    }

    private static void introduktionBoolean() {
        int a = 1;
        int b = 2;
        System.out.println(a > 2);
        System.out.println(a < b);

        // & "логическое и"
        // | "логическое или"
        // ^ "исключительное логическое или"
        // ! "отрицание,нет"

        System.out.println(a != b); // не равно
        System.out.println(a == b); // равно

    }
}

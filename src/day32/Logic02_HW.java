package day32;

import static day07.Logik01.split;

public class Logic02_HW {
    public static void main(String[] args) {

        System.out.println("Logic 12_5");
        System.out.println(roundSum(16, 17, 18));// → 60
        System.out.println(roundSum(12, 13, 14));// → 30
        System.out.println(roundSum(6, 4, 4));// → 10
        System.out.println(round10(0));
        split();

        System.out.println("Logic 12_4");

        System.out.println(loneSum(1, 2, 3));// → 6
        System.out.println(loneSum(3, 2, 3));// → 2
        System.out.println(loneSum(3, 3, 3));// → 0
        System.out.println(loneSum(3, 3, 1));// → 1
        System.out.println(loneSum(1, 3, 3));// → 1
        split();

        System.out.println("Logic 12_3");

        System.out.println(blackjack(19, 21));// → 21
        System.out.println(blackjack(21, 19));// → 21
        System.out.println(blackjack(19, 22));// → 19
        System.out.println(blackjack(23, 22));// → 19
        split();

        System.out.println("Logic 12_2");

        System.out.println(noTeenSum(1, 2, 3));// → 6
        System.out.println(noTeenSum(2, 13, 1));// → 3
        System.out.println(noTeenSum(2, 1, 14));// → 3
        System.out.println(noTeenSum(2, 18, 21));// → 3
        //System.out.println(fixTeen(14));
        split();

        System.out.println("Logic 12_1");

        System.out.println(makeBricks(4, 1, 8));// → true
        System.out.println(makeBricks(3, 1, 9));// → false
        System.out.println(makeBricks(3, 2, 10));// → true
    }

    private static boolean makeBricks(int small, int big, int goal) {
        int smallLength = 1;
        int bigLength = 5;
        if (small * smallLength + big * bigLength >= goal) {
            return true;
        }
        return false;
    }

    public static int fixTeen(int n) {
        if (n < 13 || n > 19 || n == 15 || n == 16) {
            return n;
        }
        return 0;   // if (n >= 13 && n <= 19) попадает в else
    }

    private static int noTeenSum(int a, int b, int c) {
        int sum = fixTeen(a) + fixTeen(b) + fixTeen(c);
        //System.out.println("a " + fixTeen(a));
        //System.out.println("b " + fixTeen(b));
        //System.out.println("c " + fixTeen(c));
        return sum;
    }

    private static int blackjack(int a, int b) {
        int etalon = 21;
        if (a > 21 && b > 21) {
            return 0;
        } else if (a > b && a > etalon) {
            return b;
        } else if (b > a && b > etalon) {
            return a;
        } else if (a > b) {
            return a;
        }
        return b;
    }

    private static int loneSum(int a, int b, int c) {
        int temp_a = a;
        int temp_b = b;
        int temp_c = c;
        if (a == b) {
            temp_a = 0;
            temp_b = 0;
        }
        if (a == c) {
            temp_a = 0;
            temp_c = 0;
        }
        if (b == c) {
            temp_b = 0;
            temp_c = 0;
        }
        int sum = temp_a + temp_b + temp_c;
        System.out.println("a " + temp_a);
        System.out.println("b " + temp_b);
        System.out.println("c " + temp_c);
        return sum;
    }

    public static int round10(int num) {
        if (num < 25 && num >= 15) num = 20;
        if (num < 15 && num >= 5) num = 10;
        if (num < 5) num = 0;
        return num;
    }

    public static int roundSum(int a, int b, int c) {
        int a1 = round10(a);
        int b1 = round10(b);
        int c1 = round10(c);
        int sum = a1 + b1 + c1;
        System.out.println("a1 " + a1);
        System.out.println("b1 " + b1);
        System.out.println("c1 " + c1);
        return sum;
    }
}

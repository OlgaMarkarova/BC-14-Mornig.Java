package day10;

public class HW9 {
    public static void main(String[] args) {
        System.out.println(moreOrLess(5, 6));// ожидаю -> 6
        System.out.println(moreOrLess(5, 5));//ожидаю -> 0
        System.out.println(moreOrLess(0, 100));// ожидаю -> 100
    }


    private static int moreOrLess(int a, int b) {
        //return Math.max(a, b);
        /*if (a == b) {
            return 0;
        } else if (a > b) {
            return a;
        } else {
            return b;
        }*/
        if (a < b) {
            return b;
        } else if (b < a) {
            return a;
        } else {
        return 0;
        }
    }
}
package day9;

public class HW9_2 {
    public static void main(String[] args) {
        /*Даны три целых числа, верните их сумму.
        Если первое и третье числа равны друг другу, то верните второе, если
        сумма равна нулю, то верните -1. */

        System.out.println(mySum(5, 6, 5));// ->6
        System.out.println(mySum(5, 6, 7));// ->18
        System.out.println(mySum(0, 0, 0));// ->0
        System.out.println(mySum(0, -5, 5));// ->-1
    }

    private static int mySum(int c, int d, int e) {
        int Sum = c + d + e;
        System.out.println("Получена сумма " + Sum);
        if (c + d + e == 0) {
            return -1;
        } else if (c == e) {
            return d;
        } else if (c!=e){
        }
        return Sum;
    }
}

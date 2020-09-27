package day9.hw;

public class HW9_1 {
    public static void main(String[] args) {
        //System.out.println(moreOrLess"Задание один"(5, 6));// -> 6
        //System.out.println(moreOrLess(5, 5));//-> 0
        //System.out.println(moreOrLess(0, 100));// -> 100

        //System.out.println(mySum(5, 6, 5));// ->6
        //System.out.println(mySum(5, 6, 7));// ->18
       // System.out.println(mySum(0, 0, 0));// ->0
        System.out.println(mySum(0,-5,5));// ->-1
    }

    private static int mySum(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Получена сумма " + sum);
        if (sum == 0) {
            return -1;
        } else if (a == c) {
            return b;
        } else if (a != c) {
        }
        return sum;
    }

        /*if (a == c) return b;
        else if (a + b + c == 0) return -1;
        else return a + b + c;*/



    /*private static int moreOrLess(int a, int b) {
        if (a < b) {
            return b;
        } else if (b < a) {
            return a;
        } else if (a == b) {
        }
        return 0;
    }*/

    }


package day9;

public class HW9_1 {
    public static void main(String[] args) {
        //System.out.println(moreOrLess(5, 6));// -> 6
        //System.out.println(moreOrLess(5, 5));//-> 0
        //System.out.println(moreOrLess(0, 100));// -> 100

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

    private static int moreOrLess (int a, int b){
            if (a < b) {
                return b;
            } else if (b < a) {
                return a;
            } else if (a == b) {
            }
            return 0;
        }
    }

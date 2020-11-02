package day32;

public class Logic02_6 {
    public static void main(String[] args) {
        //Given 3 int values, a b c, return their sum.
        //However, if one of the values is 13 then it does not count
        //towards the sum and values to its right do not count.
        //So for example, if b is 13, then both b and c do not count.
        System.out.println(luckySum(1, 2, 3));// → 6
        System.out.println(luckySum(1, 2, 13));// → 3
        System.out.println(luckySum(1, 13, 3));// → 1
        System.out.println(luckySum(13, 1, 3));// → 1
    }

    private static int luckySum(int a, int b, int c) {
        int sum = a + b + c;
        if (a == 13) sum = 0;
        if (b == 13) sum = a;
        if (c == 13) sum = a + b;
        return sum;
    }
}

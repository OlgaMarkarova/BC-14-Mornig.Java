package day5;

public class MyVeryLovelyDouble {
    public static void main(String[] args) {
        double d1 = 5.151515;
        double d2 = 7.171717;
        System.out.println("округленное число" + myRound(d1));
        System.out.println("округленное число" + myRound(d2));
        System.out.println("округленное число" + myRound(3.131313));
    }

    private static double myRound(double number) {
        double result = 0.0;
        //0. инпут = 5.151515
        // 1. умножть на коэф 100
        // 2 отрезать дробную часть - 515
        // 2.1 надо преоразоватьв дробь
        // 3.  снова разделить 100 - 5.15
        double temp01 = number * 100;
        //System.out.println(temp01);
        int temp02 = (int) temp01;
        //System.out.println(temp02);
        double temp03 = temp02;
        //System.out.println(temp03);
        result = temp03 / 100;


        System.out.println(temp03);
        return result;
    }
}

package day11;

public class HW11 {
    public static void main(String[] args) {
        //Даны 2 int, а и б, return их сумму.
        // Однако суммы в диапазоне 10...19 включительно,
        // запрещены, поэтому в таком случае просто верните 20.

        // System.out.println(sortaSum(3, 4));// → 7
        //System.out.println(sortaSum(9, 4));//→ 20
        //System.out.println(sortaSum(10, 11));// → 21

        //Задано число n, вернуть истину, если n находится в диапазоне 1..10 включительно.
        // Если только outsideMode не равен true,
        // в этом случае верните true, если число меньше или равно 1, или больше или равно 10.

        //System.out.println(in1To10(5, false));// → true
       // System.out.println(in1To10(11, false));// → false
        //System.out.println(in1To10(11, true));// → true

        //Верните true, если заданное неотрицательное число кратно 3 или 5,
        // но не обоим сразу.
        // Используйте оператор% "mod" - см. Введение в мод.

        System.out.println(old35(3));// → true
        System.out.println(old35(10));// → true
        System.out.println(old35(15));// → false
    }

    private static boolean old35(int a) {

        return a % 3 == 0 ^ a % 5 == 0;
        //if (number%5==0||numder%3==0){
        //return false;
        //else if (numder%5==0||number%3==0){
        //return true;
        //}
        //return false;
    }

    private static boolean in1To10(int n, boolean outsideMode) {

        if (n >= 1 && n <= 10) return true;
        return n <= 1 || outsideMode;

        //if (n >= 1 && n <= 10) {
        //return true;
        //} else if (n <= 1 || n >= 10 && outsideMode == true) {
        //return true;
        //}
        //return false;

        //return (n>=1&&n<=)|| outsideMode return true;
    }


    private static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            return 20;
        }
        return sum;
    }
}

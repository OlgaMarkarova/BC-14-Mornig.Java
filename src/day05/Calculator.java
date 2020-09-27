package day05;

public class Calculator {
    public static void main(String[] args) {
        //concatenation();
        //multiplicationTwo();
        int myLovelyVariable = multiplicationTwo(1, 2, 3, 4);
        System.out.println(myLovelyVariable);
    }

    private static int multiplicationTwo(int a, int b, int c, int d) {
        int result = a * b * c * d;
        System.out.println("ничего не понятно, чему равно b - " + b);
        System.out.println("Резальт - алое, ты где? - " + result);
        return result;
    }

    private static void multiplicationOne() {

        System.out.println("простое перемножение переменных  5 и 6 : " + 5 * 6);
    }


    private static void concatenation() {
        System.out.println("тест на плюс и конкатенацию 1: " + 4 + 5);
        System.out.println("тест на плюс и конкатенацию 2: " + (4 + 5));
        System.out.println("тест на плюс и конкатенацию 2: " + (4 + 5) + 3);
        System.out.println("тест на плюс и конкатенацию 2: " + (4 + 5) + (3 + 8));
        int a = 1;
        String s = "1";
        System.out.println(a + 1);
        System.out.println(s + "" + 1);
        System.out.println(s + ' ' + 1);


    }
}

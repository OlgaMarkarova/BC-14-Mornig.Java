package day22;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(findFibonacciNormalRecursion(7));
        //findFibonacciNormal(7);
    }

    private static int findFibonacciNormalRecursion(int number) {
        if (number == 0) {
            return 0;
        } else if (number == 1) {
            return 1;
        } else {
            //предыдущее значение + значение перед ним
            return findFibonacciNormalRecursion(number - 1)
                    + findFibonacciNormalRecursion(number - 2);
        }
    }

    private static void findFibonacciNormal(int number) {
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(n0 + " " + n1 + " ");
        for (int i = 2; i < number; i++) {    // начинаем с третьего элемента, равного двум
            n2 = n0 + n1;
            System.out.print(n2 + " ");
            n0 = n1;
            n1 = n2;
        }
        System.out.println();
    }

}

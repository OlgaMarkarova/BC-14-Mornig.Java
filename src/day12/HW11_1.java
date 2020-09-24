package day12;

public class HW11_1 {
    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));// → 7
        System.out.println(sortaSum(9, 4));//→ 20
        System.out.println(sortaSum(10, 11));// → 21

    }

    private static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 19) {
            sum = 20;
        }
        return sum;
    }
}

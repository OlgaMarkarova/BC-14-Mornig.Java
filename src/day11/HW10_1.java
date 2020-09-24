package day11;

public class HW10_1 { // сделать нечетные по этой аналогии
    public static void main(String[] args) {
        int a = 10;
        int b = 100;
        //
        //System.out.println(findEvenNumber(a, b));
        findPrimeNumber(1, 10);

    }

    private static void findPrimeNumber(int a, int b) {
        for (int i = a; i < b; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    System.out.println("Это не прайм " + i);
                }

            }

        }
    }

    private static String findEvenNumber(int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result = result + " " + i;
            }

        }
        return result;
    }

}

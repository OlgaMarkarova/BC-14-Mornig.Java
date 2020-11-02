package day33;




public class test {
    public static void main(String[] args) {
        //makeSnowflake(15);
        //boolean[][] bool = new boolean[5][5];
        //System.out.println(prefixAgain("abXYabc", 1));// → true
        //System.out.println(prefixAgain("abXYabc", 2));// → true
        //System.out.println(prefixAgain("abXYabc", 3));// → false
        //System.out.println(xyBalance("yaaxbb"));// →false);
        //xyzMiddle();
        //plusOut(String input, String word);
       // catDog(String input);
        //xyzThere(String str)
        //repeatSeparator(String word, String sep, int n)
        //mixString()
        //getSandwich();
        //wordEnds(String str, String word)
        //evenOdd(int[] input)
       // sum13(int[] input)
        //fizzArray(int n)
        //no14(int[] input)
        //matchUp();


        //Учитывая массив целых чисел нечетной длины,
        //посмотрите на первое, последнее и среднее значения в массиве и верните наибольшее.
        //Длина массива будет не меньше 1.
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 5, 3};
        int[] arr3 = new int[]{5, 2, 3};
        int[] arr4 = new int[]{2, 1, 3};
        System.out.println(maxTriple(arr1));// → 3
        System.out.println(maxTriple(arr2));// → 5
        System.out.println(maxTriple(arr3));// → 5
        System.out.println(maxTriple(arr4));// → 5

    }

    private static int maxTriple(int[] array) {
        for (int i = 0; i < array.length; i++) {
        }
        return 0;
    }

    private static boolean xyBalance(String str) {
        int numberX = 0;
        int numberY = 0;
        char symbX = 'x';
        char symbY = 'y';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbX) {
                numberX++;
            }
            if (str.charAt(i) == symbY && numberX != 0) {
                numberY++;
            }
        }
        return (numberX >= numberY && numberY != 0);
    }
    private static boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0, n);
        for (int i = n; i < str.length(); i++) {
            if (n + i <= str.length()) {
                if (prefix.equals(str.substring(i, n + i))) {
                    return true;
                }
                System.out.println("i " + str.charAt(i));
                System.out.println("n+i " + str.charAt(n + i));
                System.out.println("prefix "+prefix);
            }
        }
        return false;
    }

    private static void makeSnowflake(int number) {
        if (number % 2 == 0) {
            number = number + 1;

        }
        String line = "";
        String x = " X ";
        for (int i = 0; i < number; i++) {
            // 1. линия номер один
            // 2. линия номер два
            // 3. линия номер три
            // 4. линия номер четыре
            for (int j = 0; j < number; j++) {
                if (i == number / 2 || j == number / 2 || i == j || i == number - j - 1) {
                    //if (i == j || i == number - j - 1) {
                    System.out.print(x);
                } else {
                    System.out.print("---");
                }
            }
            System.out.println();
        }

    }
}

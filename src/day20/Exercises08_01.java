package day20;

public class Exercises08_01 {
    public static void main(String[] args) {
        //Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min;
        int max;
        double middle;
        int sum;
        System.out.println("Миаксимальное - " + myMaxNumbers(arr));
        System.out.println("Минимальное - " + myMinNumber(arr));              //лучше getMeMyMin (с глаголом)
        System.out.println("Сумма - " + mySumm(arr));
        System.out.println("Среднее - " + myMiddleNumber(arr));

    }

    private static double myMiddleNumber(int[] arr) {
        int size = arr.length;
        double middle = (double) mySumm(arr) / size;       //cust
        System.out.println("кол-во " + size);
        return middle;
    }

    private static int mySumm(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    private static int myMinNumber(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }

    private static int myMaxNumbers(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }
}

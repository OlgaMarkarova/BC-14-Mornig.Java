package day20;

public class Exercises08_01 {
    public static void main(String[] args) {
        //Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        // Для генерации случайного числа используйте метод Math.random(),
        // который возвращает значение в промежутке [0, 1].
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int min;
        int max;
        int middle;
        int sum;
        System.out.println("Миаксимальное - "+myMaxNumbers(arr));
        System.out.println("Минимальное - "+myMinNumber(arr));
        System.out.println("Сумма - "+mySumm(arr));
        System.out.println("Среднее - "+myMiddleNumber(arr));

    }

    private static int myMiddleNumber(int[] arr) {
        int size = arr.length;
        int middle = mySumm(arr) / size;
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

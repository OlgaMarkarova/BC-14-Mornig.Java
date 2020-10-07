package day21;

import day20.FillAndPrintIntArray;

public class Exercises08 {
    public static void main(String[] args) {
        // 1 .Даны два целых числа,
        // создайте массив с чётными числами в этом диапазоне.
        // создайте массив с простыми числами в этом диапазоне.
        int a = 2;
        int b = 10;
        int[] arr = createEvenArray(a, b);
        int[] arr2 = createEvenArray(30, 50);
        int[] arr3 = createEvenArray(1, 101);
        FillAndPrintIntArray.myPrintIntArray(arr);
        FillAndPrintIntArray.myPrintIntArray(arr2);
        //FillAndPrintIntArray.myPrintIntArray(arr3);
    }

    private static int[] createEvenArray(int a, int b) {
        int size = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                size++;
            }
        }
        int[] output = new int[size];
        int count = 0;
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                output[count] = i;
                count++;
            }
        }
        return output;
    }
}


package day21;

import day20.FillAndPrintIntArray;

public class ExercisesReversOther {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{5, 11, 9};
        int[] arr3 = new int[]{7, 0, 0};

        System.out.println(reverse3(arr1)); //→ [3, 2, 1]
        System.out.println(reverse3(arr2)); //→ [9, 11, 5]
        System.out.println(reverse3(arr3)); //→ [0, 0, 7]

        FillAndPrintIntArray.myPrintIntArray(reverse3(arr1));
        FillAndPrintIntArray.myPrintIntArray(reverse3(arr2));
        FillAndPrintIntArray.myPrintIntArray(reverse3(arr3));
    }

    private static int[] reverse3(int[] array) {
        int[] output = new int[3];
        output [0] = array[2];
        output [1] = array[1];
        output [2] = array[0];
        return array;
    }
}

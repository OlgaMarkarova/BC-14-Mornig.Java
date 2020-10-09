package day23;

import day20.FillAndPrintIntArray;

public class ClassWork {
    public static void main(String[] args) {

        //Given an int array length 3,
        // if there is a 2 in the array immediately followed by a 3,
        // set the 3 element to 0. Return the changed array.
        //При длине массива int 3, если в массиве есть 2,
        // сразу за которыми следует 3, установите для элемента 3 значение 0.
        // Верните измененный массив.

        int[] fix1 = new int[]{1, 2, 3};
        int[] fix2 = new int[]{2, 3, 5};
        int[] fix3 = new int[]{1, 2, 1};
        fix23(fix1);// → [1, 2, 0]
        fix23(fix2);// → [2, 0, 5]
        fix23(fix3);// → [1, 2, 1]
        FillAndPrintIntArray.myPrintIntArray(fix23(fix1));
        FillAndPrintIntArray.myPrintIntArray(fix23(fix2));
        FillAndPrintIntArray.myPrintIntArray(fix23(fix3));

        //Given an int array length 2, return true if it does not contain a 2 or 3.    !!!решить самой!!!!!
        int[] array1 = new int[]{4, 5};
        no23(array1);// →true
        int[] array2 = new int[]{4, 2};
        no23(array2);// →false
        int[] array3 = new int[]{};
        no23(array3);// →false

        //Даны 2 массива int, a и b, каждый длиной 3,
        // верните новый массив с длиной 2,
        // содержащего средний элементов первоначальных массивов.
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{2, 5};
        middleWay(arr1, arr2); //→ [2, 5]
        FillAndPrintIntArray.myPrintIntArray(middleWay(arr1, arr2));

        int[] arr3 = new int[]{7, 7, 7};
        int[] arr4 = new int[]{3, 8, 0};
        middleWay(arr3, arr4);// → [7, 8]
        FillAndPrintIntArray.myPrintIntArray(middleWay(arr3, arr4));

        int[] arr5 = new int[]{5, 2, 9};
        int[] arr6 = new int[]{1, 4, 5};
        middleWay(arr5, arr6);//// → [2, 4]
        FillAndPrintIntArray.myPrintIntArray(middleWay(arr5, arr6));
    }

    private static int[] fix23(int[] input) {
        for (int i = 1; i < input.length; i++) {
            if (input[i] == 3 && input[i - 1] == 2) {
                input[i] = 0;
            }

        }
        return input;
    }

    private static boolean[] no23(int[] input) {

        return new boolean[0];
    }

    private static int[] middleWay(int[] arr1, int[] input) {
        int[] output = new int[2];
        output[0] = arr1[1];
        output[1] = arr1[2];
        return output;
    }
}

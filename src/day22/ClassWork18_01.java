package day22;

import day20.FillAndPrintIntArray;

public class ClassWork18_01 {
    public static void main(String[] args) {
        //Дан массив int. Верните true,
        //если цифра 6 является значением в первом или последнем элементе массива.
        //Массив будет длиной больше, либо равной единице.
        int[] arr1 = new int[]{1, 2, 6};
        System.out.println(firstLast6(arr1));// → true
        int[] arr2 = new int[]{6, 1, 2, 3};
        System.out.println(firstLast6(arr2));// → true
        int[] arr3 = new int[]{13, 6, 1, 2, 3};
        System.out.println(firstLast6(arr3));// → false

        //Получив 2 массива int[], a и b, возвращаем true,
        //если они имеют один и тот же первый или последний элемент.
        //Оба массива будут длиной больше, либо равной единице.

        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = new int[]{7, 3};
        int[] b1 = new int[]{1, 2, 3};
        int[] b2 = new int[]{7, 3, 2};
        int[] c1 = new int[]{1, 2, 3};
        int[] c2 = new int[]{1, 3};
        System.out.println(commonEnd(a1, a2));//true
        System.out.println(commonEnd(b1, b2));// →false
        System.out.println(commonEnd(c1, c2));// →true

//Дан массив длиной 3, верните новый массив с элементами в обратном порядке,
// например {1, 2, 3} становится {3, 2, 1}.

        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{5, 11, 9};
        int[] array3 = new int[]{7, 0, 0};
        System.out.println(reverse3(array1));
        System.out.println(reverse3(array2));
        System.out.println(reverse3(array3));
        FillAndPrintIntArray.myPrintIntArray(reverse3(array1));
        FillAndPrintIntArray.myPrintIntArray(reverse3(array2));
        FillAndPrintIntArray.myPrintIntArray(reverse3(array3));
    }

    private static int[] reverse3(int[] array) {
        int[] output = new int[3];
        output[0] = array[2];
        output[1] = array[1];
        output[2] = array[0];
        return output;
    }

    private static boolean commonEnd(int[] array1, int[] array2) {
        if (array1[0] == array2[0] ||
                array1[array1.length-1]==array2[array2.length-1]){
            return true;
        }
        return false;
    }

    private static boolean firstLast6(int[] input) {
        if (input[0] == 6 || input[input.length - 1] == 6) {
            return true;
        }
        return false;
    }
}

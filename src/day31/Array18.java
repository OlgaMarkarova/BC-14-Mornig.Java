package day31;

import day20.FillAndPrintIntArray;

import java.util.Arrays;

import static day07.Logik01.split;

public class Array18 {
    public static void main(String[] args) {
        System.out.println("Array 18_17");
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
        split();
        System.out.println("Array 18_21");
        //Учитывая массив целых чисел, верните сумму первых двух элементов в массиве.
        //Если длина массива меньше 2,
        //просто суммируйте существующие элементы, верни 0,
        //если длина массива равна 0.
        int[] arr5 = new int[]{1, 2, 3};
        System.out.println(sum2(arr5));// →3
        int[] arr6 = new int[]{1, 1};
        System.out.println(sum2(arr6));// →2
        int[] arr7 = new int[]{1, 1, 1, 1};
        int[] arr8 = new int[]{1};//->1
        int[] arr9 = new int[]{};//->0
        System.out.println(sum2(arr7));// →2
        System.out.println(sum2(arr8));
        System.out.println(sum2(arr9));
        split();
        System.out.println("Array 18_22");
        //Given an int array length 2, return true if it contains a 2 or a 3.
        int[] arr10 = new int[]{2, 5};
        int[] arr11 = new int[]{4, 3};
        int[] arr12 = new int[]{4, 5};
        System.out.println(has23(arr10));// →true
        System.out.println(has23(arr11));// →true
        System.out.println(has23(arr12));// →false
        split();
        System.out.println("Array 18_23");
        //Given an int array, return true if the array contains 2 twice, or 3 twice.
        //The array will be length 0, 1, or 2.
        int[] arr13 = new int[]{2, 2};
        int[] arr14 = new int[]{3, 3};
        int[] arr15 = new int[]{2, 3};

        System.out.println(double23(arr13));// → true
        System.out.println(double23(arr13));// → true
        System.out.println(double23(arr14));// → true
        System.out.println(double23(arr15));// → false
        split();

        System.out.println("Array 18_24");
        //Начните с двух массивов int, a и b, каждый длиной 2.
        //Рассмотрите сумму значений в каждом массиве.
        //Вернуть массив с наибольшей суммой. В случае ничьей вернуть.
        int[] arr16 = new int[]{1, 2};
        int[] arr16_1 = new int[]{3, 4};
        int[] arr17 = new int[]{3, 4};
        int[] arr17_1 = new int[]{1, 2};
        int[] arr18 = new int[]{1, 1};
        int[] arr18_1 = new int[]{1, 2};
        biggerTwo(arr16, arr16_1);// → [3, 4]
        FillAndPrintIntArray.myPrintIntArray(biggerTwo(arr16, arr16_1));
        FillAndPrintIntArray.myPrintIntArray(biggerTwo(arr17, arr17_1));
        FillAndPrintIntArray.myPrintIntArray(biggerTwo(arr18, arr18_1));
        biggerTwo(arr17, arr17_1);// → [3, 4]
        biggerTwo(arr18, arr18_1);// → [1, 2]
        split();

        System.out.println("Array 18_25");
        int[] arr19 = new int[]{1, 2, 3, 4};
        int[] arr20 = new int[]{1, 2, 3};
        int[] arr21 = new int[]{8, 6, 7, 9, 5};
        swapEnds(arr19);// → [4, 2, 3, 1]
        swapEnds(arr20);// → [3, 2, 1]
        swapEnds(arr21);// → [5, 6, 7, 9, 8]
        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr19));
        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr20));
        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr21));
        split();
        System.out.println("Array 18_26");
        //Учитывая массив int любой длины, верните новый массив из его первых 2 элементов.
        //Если массив меньше длины 2, используйте любые присутствующие элементы.
        int[] arr22 = new int[]{1, 2, 3};
        int[] arr22_1 = new int[]{3, 4, 5};
        int[] arr23 = new int[]{1, 2};
        int[] arr24 = new int[]{1};
        System.out.println(Arrays.toString(frontPiece(arr22)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(arr22_1)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(arr23)));// → [1, 2]
        System.out.println(Arrays.toString(frontPiece(arr24)));// → [1]
        split();

        System.out.println("Array 18_27");
        //Учитывая 2 массива int, a и b, любой длины,
        //верните новый массив с первым элементом каждого массива.
        //Если любой из массивов имеет длину 0, игнорируйте этот массив.

        int[] arr25 = new int[]{1, 2, 3};
        int[] arr25_1 = new int[]{7, 9, 8};
        int[] arr26 = new int[]{1};
        int[] arr26_1 = new int[]{2};
        int[] arr27 = new int[]{1, 7};
        int[] arr27_1 = new int[]{};
        System.out.println(Arrays.toString(front11(arr25, arr25_1)));// → [1, 7]
        System.out.println(Arrays.toString(front11(arr26, arr26_1)));//;→ [1, 2]
        System.out.println(Arrays.toString(front11(arr27, arr27_1)));// → [1]

    }

    private static int[] front11(int[] a, int[] b) {
        int[] output;
        if (a.length == 0) {
            output = new int[]{b[0]};
        }
        if (b.length == 0) {
            output = new int[]{a[0]};
        } else {
            output = new int[]{a[0], b[0]};
        }
        return output;
    }

    private static int[] frontPiece(int[] input) {
        int[] output = new int[2];
        for (int i = 0; i < output.length; i++) {
            output[i] = input[i];
            if (input.length < output.length) {
                return input;
            }
        }
        return output;
    }

    private static int[] swapEnds(int[] input) {
        int[] output = new int[input.length];
        for (int i = 1; i < input.length; i++) {
            output[i] = input[i];
        }
        output[0] = input[input.length - 1];
        output[output.length - 1] = input[0];
        return output;
    }

    private static int[] biggerTwo(int[] a, int[] b) {
        int sum1 = 0;
        int sum2 = 0;
        for (int element : a) {
            sum1 += element;
        }
        for (int element : b) {
            sum2 += element;
        }
        if (sum1 > sum2) {
            return a;
        }
        return b;
    }

    private static boolean double23(int[] array) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            int etalon1 = 2;
            int etaloh2 = 3;
            if (array[i] == etalon1) {
                count1++;
            }
            if (array[i] == etaloh2) {
                count2++;
            }
        }
        if (count1 == 2 || count2 == 2) {
            return true;
        }
        return false;
    }

    private static boolean has23(int[] array) {
        int etalon1 = 2;
        int etaloh2 = 3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == etalon1 || array[i] == etaloh2) {
                return true;
            }
        }
        return false;
    }

    private static int sum2(int[] array) {
        int sum = 0;
        if (array.length == 0) {
            return 0;
        }
        if (array.length < 2) {
            return array.length;
        } else
            sum = array[0] + array[1];
        return sum;
    }

    private static int maxTriple(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            int tempPre = Math.max(array[i], array[i + 1]);
            int tempResult = Math.max(tempPre, array[i - 1]);
            System.out.println("temp " + tempResult);
            return tempResult;
        }
        return 0;
    }
}

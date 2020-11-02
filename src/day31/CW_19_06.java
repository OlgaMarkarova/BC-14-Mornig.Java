package day31;

import java.util.Arrays;

import static day07.Logik01.split;

public class CW_19_06 {
    public static void main(String[] args) {

        //Учитывая массивы nums1 и nums2 одинаковой длины,
        //для каждого элемента в nums1 рассмотрим соответствующий элемент в nums2
        //(с тем же индексом).
        //Возвратите количество раз, когда два элемента отличаются
        //на 2 или меньше, но не равны.
        System.out.println("difference ");
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr1_1 = new int[]{2, 3, 10};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr2_1 = new int[]{2, 3, 5};
        int[] arr3 = new int[]{1, 2, 3};
        int[] arr3_1 = new int[]{2, 3, 3};
        System.out.println(matchUp(arr1, arr1_1));// →2
        System.out.println(matchUp(arr2, arr2_1));// →3
        System.out.println(matchUp(arr3, arr3_1));// →2
        // Given an array of ints, return true
        // if the array contains either 3 even or 3 odd values all next to each other.

        //Для массива целых чисел вернуть true,
        //если массив содержит 3 четных или 3 нечетных значения,
        //расположенных рядом друг с другом.
        int[] arr7 = new int[]{2, 1, 3, 5};
        int[] arr8 = new int[]{2, 1, 2, 5};
        int[] arr9 = new int[]{2, 4, 2, 5};
        System.out.println(modThree(arr7));// →true
        System.out.println(modThree(arr8));// →false
        System.out.println(modThree(arr9));// →true
        split();
        //Верните истину, если группа из N чисел в начале и конце массива одинакова.
        // Например, для {5, 6, 45, 99, 13, 5, 6} концы одинаковы для n = 0 и n = 2 и
        // ложны для n = 1 и n = 3.
        //Вы можете предположить, что n находится в диапазоне 0..nums.length включительно.
        int[] arr10 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr11 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr12 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr13 = new int[]{1, 2, 3, 5, 6, 7, 1, 2, 3};
        System.out.println(sameEnds(arr10, 1));// →false
        System.out.println(sameEnds(arr11, 2));// →true
        System.out.println(sameEnds(arr12, 3));// → false
        System.out.println(sameEnds(arr13, 3));// → true
        split();

        //Возвращает массив, который "сдвинут влево" на единицу,
        //поэтому {6, 2, 5, 3} возвращает {2, 5, 3, 6}.
        //Вы можете изменить и вернуть данный массив или вернуть новый массив.
        int[] arr14 = new int[]{6, 2, 5, 3};
        int[] arr15 = new int[]{1, 2};
        int[] arr16 = new int[]{1};
        shiftLeft(arr14);// → [2, 5, 3, 6]
        System.out.println(arr14);
        shiftLeft(arr15);// → [2, 1]
        System.out.println(arr15);
        shiftLeft(arr16);// → [1]
        System.out.println(arr16);
        split();

        //Учитывая непустой массив целых чисел, верните новый массив,
        //содержащий элементы из исходного массива,
        //которые идут после последних 4 в исходном массиве.
        //Исходный массив будет содержать по крайней мере один 4.
        //Обратите внимание, что в java можно создать массив длиной 0.
        int[]arr17=new int[]{2, 4, 1, 2};
        System.out.println(post4(arr17));// → [1, 2]
        int[]arr18=new int[]{4, 1, 4, 2};
        System.out.println(post4(arr18));// → [2]
        int[]arr19=new int[]{4, 4, 1, 2, 3};
        System.out.println(post4(arr19));// → [1, 2, 3]
    }

    private static int[] post4(int[] array) {
        int[]output= new int[]{};
        for (int i = 0; i < array.length; i++) {

        }
        return output;
    }

    private static int[] shiftLeft(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length-1; i++) {
            int temp = output[input.length - 1];
            output[0] = output[input.length - 1];
            output[0] = temp;
        }
        return output;
    }

    private static int matchUp(int[] array1, int[] array2) {
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            int difference = Math.abs(array1[i] - array2[i]);
            if (difference == 2 || difference == 1) {
                count++;
            }
        }
        return count;
    }

    private static boolean sameEnds(int[] array, int n) {
        for (int i = 0; i < n; i++) {
            if (array[i] != array[array.length - n + i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean modThree(int[] array) {
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] % 2 == 1 && array[i + 1] % 2 == 1 && array[i - 1] % 2 == 1) {
                return true;
            }
            if (array[i] % 2 == 0 && array[i + 1] % 2 == 0 && array[i - 1] % 2 == 0) {
                return true;
            }
        }
        return false;
    }
}

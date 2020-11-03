package day02_modui02;

import day20.FillAndPrintIntArray;

import java.util.Arrays;

import static day07.Logik01.split;

public class ArrayTasks {
    public static void main(String[] args) {
        //Вернуть массив, содержащий те же числа, что и данный массив,
        //но переупорядоченный так, чтобы все четные числа стояли перед всеми нечетными числами.
        //Кроме этого, числа могут быть в любом порядке.
        //Вы можете изменить и вернуть данный массив или создать новый массив.
        int[] arr1 = new int[]{1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = new int[]{3, 3, 2};
        int[] arr3 = new int[]{2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(arr1)));
        System.out.println(Arrays.toString(evenOdd(arr2)));
        System.out.println(Arrays.toString(evenOdd(arr3)));
        split();
        //Вернуть массив, который содержит те же числа, что и данный массив,
        //но переупорядочен так, чтобы все нули были сгруппированы в начале массива.
        //Порядок ненулевых чисел не имеет значения.
        //Таким образом, {1, 0, 0, 1} становится {0, 0, 1, 1}.
        //Вы можете изменить и вернуть данный массив или создать новый массив.

        int[] arr4 = new int[]{1, 0, 0, 1};
        int[] arr5 = new int[]{0, 1, 1, 0, 1};
        int[] arr6 = new int[]{1, 0};
        System.out.println(Arrays.toString(zeroFront(arr4)));// → [0, 0, 1, 1]
        System.out.println(Arrays.toString(zeroFront(arr5)));// → [0, 0, 1, 1, 1]
        System.out.println(Arrays.toString(zeroFront(arr6)));// → [0, 1]
        split();
        // Учитывая непустой массив целых чисел, верните новый массив,
        // содержащий элементы из исходного массива,
        // которые находятся перед первыми 4 в исходном массиве.
        // Исходный массив будет содержать по крайней мере один 4.
        // Обратите внимание, что в java можно создать массив длиной 0.
        int[] arr7 = new int[]{1, 2, 4, 1};
        int[] arr8 = new int[]{3, 1, 4};
        int[] arr9 = new int[]{1, 4, 4};
        System.out.println(Arrays.toString(pre4(arr7)));// → [1, 2]
        System.out.println(Arrays.toString(pre4(arr8)));// → [3, 1]
        System.out.println(Arrays.toString(pre4(arr9)));// → [1]
        split();
        //Учитывая начальные и конечные числа, верните новый массив,
        //содержащий последовательность целых чисел от начала до конца,
        //но не включая его, поэтому start = 5 и end = 10 дает {5, 6, 7, 8, 9}.
        //Конечный номер будет больше или равен начальному.
        //Обратите внимание, что допустим массив длины 0. (См. Также: Код FizzBuzz)
        FillAndPrintIntArray.myPrintIntArray(fizzArray3(5, 10));// → [5, 6, 7, 8, 9]
        FillAndPrintIntArray.myPrintIntArray(fizzArray3(11, 18));// → [11, 12, 13, 14, 15, 16, 17]
        FillAndPrintIntArray.myPrintIntArray(fizzArray3(1, 3));// → [1, 2]

    }

    private static int[] fizzArray3(int start, int end) {
        int[]output = new int[0];
        for (int i = start; i < end; i++) {
             output[i] =i;
        }
return output;
    }

    public static int[] pre4(int[] array) {
        int size = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 4) {
                size = i;
                break;
            }
        }
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = array[i];
        }
        return output;
    }

    public static int[] zeroFront(int[] array) {
        int[] output = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                output[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                output[count] = array[i];
                count++;
            }
        }
        return output;
    }

    private static int[] evenOdd(int[] array) {
        int[] output = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                output[count] = array[i];
                count++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                output[count] = array[i];
                count++;
            }
        }
        return output;
    }
}

package day33;

import java.util.Arrays;

public class Array19_10 {
    public static void main(String[] args) {
        //Учитывая непустой массив целых чисел, верните новый массив,
        //содержащий элементы из исходного массива, которые идут после последних 4
        //в исходном массиве. Исходный массив будет содержать по крайней мере один 4.
        //Обратите внимание, что в java можно создать массив длиной 0.
        int[] arr1 = new int[]{2, 4, 1, 2};
        int[] arr2 = new int[]{4, 1, 4, 2};
        int[] arr3 = new int[]{4, 4, 1, 2, 3};

        System.out.println(Arrays.toString(post4(arr1)));//→ [1, 2]
        System.out.println(Arrays.toString(post4(arr2)));// → [2]
        System.out.println(Arrays.toString(post4(arr3)));// → [1, 2, 3]
        //1. find last 4;
        //2. find output array length;
        //3. fill new output array
    }

    private static int[] post4(int[] input) {
        /*int indexFor = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == 4) {
                indexFor = i;
                break;
            }
        }
        int size = input.length - indexFor - 1;
        int[] output = new int[size];
        for (int i = size; i >= 0; i--) {
            output[i] = input[input.length + i - size];
        }
        return output;*/
        int indexFor = 0;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == 4) {
                indexFor = i;
                break;
            }           //1 - done
        }
        int size = input.length - indexFor - 1;
        int[] output = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            output[i] = input[input.length + i - size];
            for (int j = 0; j < size; j++) {
                output[i] = input[i + indexFor + 1];

            }
        }
        return output;
    }
}

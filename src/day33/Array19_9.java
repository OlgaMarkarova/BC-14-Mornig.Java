package day33;

import java.util.Arrays;

import static day07.Logik01.split;

public class Array19_9 {
    public static void main(String[] args) {
        //Возвращает массив, который «сдвинут влево» на единицу,
        //поэтому {6, 2, 5, 3} возвращает {2, 5, 3, 6}.
        //Вы можете изменить и вернуть данный массив или вернуть новый массив.
        int[] arr1 = new int[]{6, 2, 5, 3};
        int[] arr2 = new int[]{1, 2};
        int[] arr3 = new int[]{1};
        shiftLeft(arr1);// → [2, 5, 3, 6]
        shiftLeft(arr2);// → [2, 1]
        shiftLeft(arr3);//→ [1]

        System.out.println(Arrays.toString(shiftLeft(arr1)));
        System.out.println(Arrays.toString(shiftLeft(arr2)));
        System.out.println(Arrays.toString(shiftLeft(arr3)));
        split();
        System.out.println(Arrays.toString(reverse(arr1)));
        System.out.println(Arrays.toString(reverse(arr2)));
        System.out.println(Arrays.toString(reverse(arr3)));
    }

    private static int[] shiftLeft(int[] input) {
        int[] output = new int[input.length];
        for (int i = 1; i < input.length; i++) {
            output[i - 1] = input[i];
        }
        output[input.length - 1] = input[0];
        return output;
    }

    private static int[] reverse(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - 1 - i] = input[i];
        }
        return output;
    }
}

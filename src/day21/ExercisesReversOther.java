package day21;

import day20.FillAndPrintIntArray;

public class ExercisesReversOther {
        public static void main(String[] args) {
            int[] arr1 = new int[]{1, 2, 3, 4, 5, 6, 7};
            int[] arr2 = new int[]{4, 2, 8, 4, 15, 6, 57, 56};
            int[] arr3 = new int[]{15, 6, 57, 56, 1000};
            FillAndPrintIntArray.myPrintIntArray(arrayReverse(arr1));
            FillAndPrintIntArray.myPrintIntArray(arrayReverse(arr2));
            FillAndPrintIntArray.myPrintIntArray(arrayReverse(arr3));
        }

        private static int[] arrayReverse(int[] input) {
            int[] output = new int[input.length];
            for (int i = 0; i < input.length; i++) {
                output[output.length - 1 - i] = input[i];
            }
            return output;
        }
}

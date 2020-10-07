package day21;

import day20.FillAndPrintIntArray;

public class ExercisesDelete {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int index = 3;
        System.out.println(deleteIndexInArray(arr, index));
        FillAndPrintIntArray.myPrintIntArray(deleteIndexInArray(arr, index));  //разобраться!!!!!
    }

    private static int[] deleteIndexInArray(int[] arr, int index) {
        int[] output = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = arr[i];
        }
        for (int i = 0; i < output.length; i++) {
            output[i] = arr[i+1];
        }
        return output;
    }
}

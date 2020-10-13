package day21;

import day20.FillAndPrintIntArray;

public class ExercisesAddElement {
    public static void main(String[] args) {
        int[] customerArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int key = 4;          //порядковый ноиер, индекс
        int value = 100;     //ее значеие
        FillAndPrintIntArray.myPrintIntArray(addElement(customerArray, key, value));
    }

    private static int[] addElement(int[] input, int kay, int value) {
        int[] result = new int[input.length + 1];
        for (int i = 0; i < kay; i++) {
            result[i] = input[i];
        }
        for (int i = kay+1; i <result.length ; i++) {
            result[i]=input[i-1];
            result[kay]=value;
            {
                return result;
            }
        }
        return result;
    }
}

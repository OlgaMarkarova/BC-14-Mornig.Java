package day21;

import day20.FillAndPrintIntArray;

public class ExercisesAddElement {
    public static void main(String[] args) {
        int[] customerArray = new int[]{1, 2, 3, 4, 5, 6, 7};
        int key = 4;          //порядковый ноиер, индекс
        int value = 100;     //ее значеие
        addElement(customerArray, key, value);
        //FillAndPrintIntArray.myPrintIntArray(customerArray,key,value);
    }

    private static int[] addElement(int[] input, int index, int value) {
        int[] result = new int[input.length + 1];
        for (int i = 0; i < index; i++) {
            result[i] = input[i];
        }
        for (int i = index+1; i <result.length ; i++) {
            result[i]=input[i-1];
            result[index]=value;
            {
                return result;
            }
        }
        return result;
    }
}

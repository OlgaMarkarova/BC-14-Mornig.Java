package day04_modul02;

import java.util.Arrays;

public class TestSort {
    public static void main(String[] args) {
        System.out.println("Сортировка массива с помощью 'Сортировка вставками'");
        int[] array = {22, 100, 48, 23, 3, 80, 54, 35, 35};
        //System.out.println(Arrays.toString(array));
        insertionSortImperative(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSortImperative(int[] input) {
        for (int i = 1; i < input.length; i++) {
            int bookToProof = input[i];
            for (int location = i; location > 0; location--) {
                if (input[location] < input[location - 1]) {
                    input[location] = input[location - 1];
                    input[location - 1] = bookToProof;
                } else if (input[location] > input[location - 1]) {
                    break;
                }
            }
        }
    }
}


package day04_modul02;

import java.util.Arrays;

public class InsertionSort {
    //int[] arr = {5, 17, 4, 30, 6};
    //17
    //{5, 17, 4, 30, 6}
    //4
    //{4, 5, 17, 30, 6}
    //30
    //{4, 5, 17, 30, 6}
    //6
    //{4, 5, 6, 17, 30}
    public static void main(String[] args) {
        System.out.println("Сортировка массива с помощью 'Сортировка вставками'");
        int[] array = {22, 100, 48, 47, 46, 45, 50};
        System.out.println(Arrays.toString(array));
        insertionSortImperative(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSortImperative(int[] input) {
        for (int i = 1; i < input.length; i++) {  // идем с элемента с индексом 1, 0-элемнт всегда отсортирован
            int temp = input[i]; //временная переменная, кот.хранит значение от i
            int location = i - 1; //цикл не с нуля
            while (location >= 0 && input[location] > temp) {
                input[location + 1] = input[location];
                location = location - 1;
            }
            input[location + 1] = temp;
        }
    }
}




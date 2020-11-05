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
        int[] array = {22, 100, 65, 78, 45, 87};
        insertionSortImperative(array);
        System.out.println(Arrays.toString(array));
    }

    private static void insertionSortImperative(int[] sobranieSochinenij) {
        for (int i = 1; i < sobranieSochinenij.length; i++) {  // идем с элемента с индексом 1, 0-элемнт всегда отсортирован
            int knigaVRukach = sobranieSochinenij[i]; //временная переменная, кот.хранит значение от i
            int pervajKnigaNaPolke = i - 1; //цикл не с нуля
            while (pervajKnigaNaPolke >= 0 && sobranieSochinenij[pervajKnigaNaPolke] > knigaVRukach) {
                sobranieSochinenij[pervajKnigaNaPolke + 1] = sobranieSochinenij[pervajKnigaNaPolke];
                //присвоили значение
                pervajKnigaNaPolke = pervajKnigaNaPolke - 1;
                // index - место в полке
                //bookToProof-книга в руках
            }
            sobranieSochinenij[pervajKnigaNaPolke + 1] = knigaVRukach;
        }
    }



}

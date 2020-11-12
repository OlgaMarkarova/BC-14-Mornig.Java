package day07_modul02;

import java.util.Arrays;

public class HW {
    public static void main(String[] args) {
        //Если n> = 0, создайте массив с шаблоном {1, 1, 2, 1, 2, 3, .. 1, 2, 3 .. n}
        // (пробелы добавлены, чтобы показать группировку). Обратите внимание,
        // что длина массива будет 1 + 2 + 3 .. + n, что, как известно,
        // составляет в точности n * (n + 1) / 2.
        System.out.println(Arrays.toString(seriesUp(3)));// → [1, 1, 2, 1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4)));// → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2)));// → [1, 1, 2]

        //Возвратите массив, который содержит точно такие же числа,
        // что и данный массив, но переставлен так, чтобы за каждой 3 сразу следовала 4.
        // Не перемещайте тройки, но все остальные числа могут перемещаться.
        // Массив содержит одинаковое количество троек и четверок,
        // после каждой тройки стоит номер, который не равен 3, а 3 появляется в массиве перед любыми 4.
        int[]arr1=new int[]{1, 3, 1, 4};
        System.out.println(Arrays.toString(fix34(arr1)));// → [1, 3, 4, 1]
        int[]arr2=new int[]{1, 3, 1, 4, 4, 3, 1};
        System.out.println(Arrays.toString(fix34(arr2)));//→ [1, 3, 4, 1, 1, 3, 4]
        int[] arr3=new int[]{3, 2, 2, 4};
        System.out.println(Arrays.toString(fix34(arr3)));// → [3, 4, 2, 2]
    }

    private static int[] fix34(int[] input) {
        int temp=0;
        for (int i = 0; i < input.length; i++) {
            if (input[i]==3){
                for (int j = input[i]; j < input.length; j++) {
                    if (input[j]==4){
                        temp=input[i+1];
                        input[i+1]=input[j];
                        input[j]=temp;
                    }

                }
            }
        }
        return input;
    }

    private static int[] seriesUp(int n) {
        int[]output=new int[n * (n + 1) / 2];
        for (int i = 0; i < n; i++) {

        }
        return output;
    }
}

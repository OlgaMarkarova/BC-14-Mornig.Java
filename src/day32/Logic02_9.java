package day32;

import day30_homeworkOlga.BubbleSortIntro;

public class Logic02_9 {
    public static void main(String[] args) {
        // Даны три целых числа, a b c, одна из них маленькая,
        //одна средняя и одна большая. Верните true,
        //если три значения расположены равномерно,
        //поэтому разница между малым и средним такая же,
        //как разница между средним и большим.
        System.out.println(evenlySpaced(2, 4, 6));// → true
        System.out.println(evenlySpaced(4, 6, 2));// → true
        System.out.println(evenlySpaced(4, 6, 3));// → false
    }

    private static boolean evenlySpaced(int a, int b, int c) {
        int small, medium, large;
       int []arr=new int[]{a,b,c};
        BubbleSortIntro.bubbleSort(arr);

        return false;
    }
}

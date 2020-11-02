package day31;


import java.util.Arrays;

public class Homework31 {
    public static void main(String[] args) {
        char[] charArray1 = new char[]{'$', '@', '!', '(', '*', '?'};
        String str = "В лесу родилась ёлочка красивая";
        char[] charArray2 = str.toCharArray();
        String cyrillic = ".,абвгдеёжзиӣклмнопрстуфхцчшщъыьэюя";
        char[] charArray3 = cyrillic.toCharArray();
        sort1(charArray1);
        System.out.println(Arrays.toString(charArray1));
        sort1(charArray2);
        System.out.println(Arrays.toString(charArray2));
        sort1(charArray3);
        System.out.println(Arrays.toString(charArray3));
    }

    private static void sortLex(char[]arr) {
        int count=0;
        for (int i = 0; i <arr.length-1 ; i++) {
            String x = String.valueOf(arr[i]);
            String y = String.valueOf(arr[i + 1]);
            if (x.compareTo(y) > 0) {
                swapNormal(arr, i, i + 1);
                count++;
            }
        }
        if (count>0){
            sort1(arr);
        }

    }

    private static void sort1(char[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                swapNormal(arr, i, i + 1);
                count++;
            }
        }
        if (count>0){
            sort1(arr);
        }
    }

    private static void swapNormal(char[] arr, int x, int y) {
        char temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

}

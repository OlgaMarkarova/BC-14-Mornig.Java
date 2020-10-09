package day23;

import day20.FillAndPrintIntArray;

public class HW<output> {
    public static void main(String[] args) {
        //Given two strings, word and a separator sep,
        //return a big string made of count occurrences of the word, separated by the
        //separator string.
       /* System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"*/

        //A sandwich is two pieces of bread with something in between.
        //Return the string that is between the first and last
        //appearance of "bread" in the given string,
        //or return the empty string "" if there are not two pieces of bread.
        //эндвич - это два куска хлеба с чем-то средним.
        //Верните string, который находится между первым и последним появлением «хлеба» в данноm string,
        //или верните пустую строку «», если нет двух кусков хлеба.
        // System.out.println(getSandwich("breadjambread"));// → "jam"
        //System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        //System.out.println(getSandwich("xxbreadyy"));// → ""

        //Ищите шаблоны, такие как «zip» и «zap» в string - length-3,
        //начиная с «z» и заканчивая «p». Вернуть строку, где для
        //во всех таких словах средняя буква отсутствует, поэтому «zipXzap» дает «zpXzp».
        //System.out.println(zipZap("zipXzap"));// → "zpXzp"
        //System.out.println(zipZap("zopzop"));// → "zpzp"
        //System.out.println(zipZap("zzzopzop"));// → "zzzpzp"

        /*int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{8, 6, 7, 9, 5};
        swapEnds(arr1);// → [4, 2, 3, 1]      !!!!!!!
        swapEnds(arr2);// → [3, 2, 1]
        swapEnds(arr3);// → [5, 6, 7, 9, 8]    !!!!!!

        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr1));
        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr2));
        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr3));
*/
        //Учитывая массив int любой длины, верните новый массив из его первых 2 элементов.
        //Если массив меньше длины 2, используйте все
        //элементы присутствуют.

        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2};
        int[] array3 = new int[]{1};
        frontPiece(array1);// → [1, 2]
        frontPiece(array2);// → [1, 2]
        frontPiece(array3);// → [1]

        FillAndPrintIntArray.myPrintIntArray(frontPiece(array1));
        FillAndPrintIntArray.myPrintIntArray(frontPiece(array2));
        FillAndPrintIntArray.myPrintIntArray(frontPiece(array3));
    }

    private static int[] frontPiece(int[] input) {
        int[] output = new int[input.length-1];
        for (int i = 0; i < input.length; i++) {

            if (input[i] < 2) {
                return input;
            } else if (input[i]>=2){
                output[i]=input[i];
            }
        }

        return output;
    }

    private static int[] swapEnds(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[output.length - 1 - i] = input[i];
        }
        return output;
    }

    private static String getSandwich(String input) {
        String output = "";


        return output;
    }

    private static String zipZap(String input) {
        String str1 = "zip";
        if (input.startsWith("z") && input.endsWith("p")) {
            //else if (str.substring(0, 4).equals("blue")) {
            //            return "blue";
            return input;
        }
        return input;
    }


    //private static String makeAbba(String c1, String c2) {
    // String itog1 = c1.substring(0) + c2.substring(0) + c2.substring(0) + c1.substring(0);
    // return itog1;
    private static String repeatSeparator(String word, String sep, int a) {
        //for (int i = 0; i <= a; i++) {
        String result = word + sep;
        if (a == 3) {
            return result + result + word;
        } else if (a == 2) return result + word;
        return word;
    }

}


package day23;

import day20.FillAndPrintIntArray;

public class HW<output> {
    public static void main(String[] args) {
        //Given two strings, word and a separator sep,
        //return a big string made of count occurrences of the word, separated by the
        //separator string.
        //System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        //System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        //System.out.println(repeatSeparator("This", "And", 1));// → "This"

        //A sandwich is two pieces of bread with something in between.
        //Return the string that is between the first and last
        //appearance of "bread" in the given string,
        //or return the empty string "" if there are not two pieces of bread.

        //эндвич - это два куска хлеба с чем-то средним.
        //Верните string, который находится между первым и последним появлением «хлеба» в данноm string,
        //или верните пустую строку «», если нет двух кусков хлеба.

        //System.out.println(getSandwich("breadjambread"));// → "jam"
        //System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        //System.out.println(getSandwich("xxbreadyy"));// → ""

        //Ищите шаблоны, такие как «zip» и «zap» в string - length-3,
        //начиная с «z» и заканчивая «p». Вернуть строку, где для
        //во всех таких словах средняя буква отсутствует, поэтому «zipXzap» дает «zpXzp».

        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"

        //System.out.println(zipZapRegX("zipXzap"));
        //System.out.println(zipZapRegX("zopzop"));
        //System.out.println(zipZapRegX("zzzopzop"));


        //Given an array of ints, swap the first and last elements in the array.
        //Return the modified array. The array length will be at
        //least 1.
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 2, 3};
        int[] arr3 = new int[]{8, 6, 7, 9, 5};
        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr1));// → [4, 2, 3, 1]
        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr2));//→ [3, 2, 1]
        FillAndPrintIntArray.myPrintIntArray(swapEnds(arr3));//→ [5, 6, 7, 9, 8]

        FillAndPrintIntArray.myPrintIntArray(swapEndsOther(arr1));
        FillAndPrintIntArray.myPrintIntArray(swapEndsOther(arr2));
        FillAndPrintIntArray.myPrintIntArray(swapEndsOther(arr3));


        //Дан массив int любой длины, верните новый массив из его первых 2 элементов.
        //Если массив меньше длины 2, используйте все
        //элементы.

        int[] array1 = new int[]{1, 2, 3};
        int[] array2 = new int[]{1, 2};
        int[] array3 = new int[]{1};
        frontPiece(array1);// → [1, 2]
        frontPiece(array2);// → [1, 2]
        frontPiece(array3);// → [1]

        FillAndPrintIntArray.myPrintIntArray(frontPiece(array1));
        FillAndPrintIntArray.myPrintIntArray(frontPiece(array2));
        FillAndPrintIntArray.myPrintIntArray(frontPiece(array3));

        //Given 2 int arrays, a and b, of any length,
        //return a new array with the first element of each array. If either array is length 0,
        //ignore that array.
        int[] array4 = new int[]{1, 2, 3};
        int[] array5 = new int[]{7, 9, 8};
        int[] array6 = new int[]{1};
        int[] array7 = new int[]{2};
        int[] array8 = new int[]{1, 7};
        int[] array9 = new int[]{};
        front11(array4, array5);// → [1, 7]
        front11(array6, array7);//→ [1, 2]
        //front11(array8, array9);// → [1]
        FillAndPrintIntArray.myPrintIntArray(front11(array4, array5));//1,7
        FillAndPrintIntArray.myPrintIntArray(front11(array6, array7));//1,
        //FillAndPrintIntArray.myPrintIntArray(front11(array8, array9));//1,
    }

    private static String zipZapRegX(String input) {
        String output = "";
        output = input.replaceAll("z.p", "zp");
        String str1 = "zip";
        if (input.startsWith("z") && input.endsWith("p")) {
        }
        return output;
    }

    private static int[] front11(int[] a, int[] b) {
        /*int[] output = new int[2];
        output[0] = a[0];
        output[1] = b[0];*/
        return a;
    }

    private static int[] frontPiece(int[] input) {

        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (i < 2) {
                output[i] = input[i];
            } else {
            }
        }
        return output;
    }

    private static int[] swapEnds(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }
        output[0] = input[input.length - 1];
        output[input.length - 1] = input[0];
        return output;
    }

    private static int[] swapEndsOther(int[] input) {
        int temp = input[0];
        input[0] = input[input.length - 1];
        input[input.length - 1] = temp;
        return input;
    }

    private static String getSandwich(String input) {
        String output = "";
        int indexStart = 0;
        String bread = "bread";
        indexStart = input.indexOf(bread);
        int indexEnd = input.lastIndexOf(bread);
        if (indexEnd != indexStart) {
            output = input.substring(indexStart + bread.length(), indexEnd);
        }
        return output;
    }

    private static String zipZap(String input) {
        String output = input;
        for (int i = 0; i < output.length() - 1; i++) {
            if (output.charAt(i - 1) == 'z' && output.charAt(i + 1) == 'p') {
                output = output.substring(0, i) + output.substring(i + 1);
            }
        }
        return output;
    }


    private static String repeatSeparator(String word, String sep, int a) {
        String result = word + sep;
        if (a == 3) {
            return result + result + word;
        } else if (a == 2) return result + word;
        return result;

        // с циклом запуталась, написала самым простым способом((

        /*String result = "";
        for (int i = 0; i < a; i++) {
            result += word + sep;
        }
        result+=word;
        return result;*/
    }

}


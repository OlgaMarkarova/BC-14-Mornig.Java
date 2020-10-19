package day28;

import day20.FillAndPrintIntArray;

import javax.crypto.spec.PSource;

import static day07.Logik01.split;

public class ClassWorkArray {
    public static void main(String[] args) {
        //We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
        //Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
        System.out.println("файл 18 задача 9");
        int[] arr1 = new int[]{1, 3, 4, 5};
        int[] arr2 = new int[]{2, 1, 3, 4, 5};
        int[] arr3 = new int[]{1, 1, 1};
        System.out.println(unlucky1(arr1));// → true
        System.out.println(unlucky1(arr2));// → true
        System.out.println(unlucky1(arr3));// → false

        split();

        //Given an array of ints, return true if the array is length 1 or more,
        //and the first element and the last element are equal.
        //Для массива целых чисел вернуть true, если длина массива равна 1 или больше,
        // и первый элемент и последний элемент равны.
        System.out.println("файл 18 задача 10");
        int[] arr4 = new int[]{1, 2, 3};
        int[] arr5 = new int[]{1, 2, 3, 1};
        int[] arr6 = new int[]{1, 2, 1};

        System.out.println(sameFirstLast(arr4));// → false
        System.out.println(sameFirstLast(arr5));// → true
        System.out.println(sameFirstLast(arr6));// → true
        split();

        System.out.println("файл 18 задача 11");
        //Учитывая массив длиной 3 целых числа, вернуть сумму всех элементов.
        int[] arr7 = new int[]{1, 2, 3};
        int[] arr8 = new int[]{5, 11, 2};
        int[] arr9 = new int[]{7, 0, 0};
        System.out.println(sum3(arr7));// → 6
        System.out.println(sum3(arr8));// → 18
        System.out.println(sum3(arr9));// → 7
        split();
        System.out.println("файл 18 задача 12");
        //Учитывая массив с длиной int 3, выясните, какой из них больше,
        // первый или последний элемент в массиве, и установите все остальные элементы на это значение.
        // Вернуть измененный массив.
        int[] arr10 = new int[]{1, 2, 3};
        int[] arr11 = new int[]{11, 5, 9};
        int[] arr12 = new int[]{2, 11, 3};
        maxEnd3(arr10);// → [3, 3, 3]
        maxEnd3(arr11);// → [11, 11, 11]
        maxEnd3(arr12);// → [3, 3, 3]
        FillAndPrintIntArray.myPrintIntArray(maxEnd3Other(arr10));
        FillAndPrintIntArray.myPrintIntArray(maxEnd3Other(arr11));
        FillAndPrintIntArray.myPrintIntArray(maxEnd3Other(arr12));

        split();
        System.out.println("файл 18 задача 12/1");
        FillAndPrintIntArray.myPrintIntArray(maxEnd3(arr10));
        FillAndPrintIntArray.myPrintIntArray(maxEnd3(arr11));
        FillAndPrintIntArray.myPrintIntArray(maxEnd3(arr12));
        split();

        System.out.println("файл 18 задача 13");
        int[] arr13 = new int[]{1, 2, 3};
        int[] arr14 = new int[]{1, 2, 3, 4};
        int[] arr15 = new int[]{7, 4, 6, 2};
       /* makeEnds(arr13) → [1, 3]
        makeEnds(arr14) → [1, 4]
        makeEnds(arr15) → [7, 2]*/
        split();

        System.out.println("файл 18 задача 14");
        //Given an int array, return a new array with double the length
        //where its last element is the same as the original array, and all the other elements are 0.
        //The original array will be length 1 or more. Note: by default, a new int array contains all 0's.
        int[] arr16 = new int[]{4, 5, 6};
        int[] arr17 = new int[]{1, 2};
        int[] arr18 = new int[]{3};
        makeLast(arr16);// → [0, 0, 0, 0, 0, 6]
        makeLast(arr17);// → [0, 0, 0, 2]
        makeLast(arr18);// → [0, 3]
        FillAndPrintIntArray.myPrintIntArray(makeLast(arr16));
        FillAndPrintIntArray.myPrintIntArray(makeLast(arr17));
        FillAndPrintIntArray.myPrintIntArray(makeLast(arr18));
        split();

        System.out.println("файл 18 задача 15"); //!!!!
        int[] arr19 = new int[]{1, 2, 3};
        int[] arr19_1 = new int[]{1, 3};
        int[] arr20 = new int[]{7, 2, 3};
        int[] arr20_1 = new int[]{1};
        int[] arr21 = new int[]{1, 2};
        int[] arr21_1 = new int[0];
        System.out.println(start1(arr19, arr19_1));//2
        System.out.println(start1(arr20, arr20_1));//1
        System.out.println(start1(arr21, arr20_1));//1
        split();

        System.out.println("из скайп 1");
        //Сложите массивы (concat)
        int[] arr22 = new int[]{1, 2, 3};
        int[] arr22_1 = new int[]{4, 5, 6};
        int[] arr23 = new int[]{1, 2, 3, 4};
        int[] arr23_1 = new int[]{5, 6};
        sumOne(arr22, arr22_1);//  -> [1,2,3,4,5,6]
        sumOne(arr23, arr23_1);// ->[1,2,3,4,5,6]
        FillAndPrintIntArray.myPrintIntArray(sumOne(arr22, arr22_1));
        FillAndPrintIntArray.myPrintIntArray(sumOne(arr23, arr23_1));
        split();

        System.out.println("из скайп 2");
        //Сложите массивы (сложение)
        int[] arr24 = new int[]{1, 2, 3};
        int[] arr24_1 = new int[]{4, 5, 6};
        int[] arr25 = new int[]{1, 2, 3, 4};
        int[] arr25_1 = new int[]{5, 6};
        sumTwo(arr24, arr24_1);//  -> [5,7,9]
        sumTwo(arr25, arr25_1);//  -> [6,8,3,4]
        FillAndPrintIntArray.myPrintIntArray(sumTwo(arr24, arr24_1));
        FillAndPrintIntArray.myPrintIntArray(sumTwo(arr25, arr25_1));
        split();

        System.out.println("файл 19 задача 4");
        // Given a number n, create and return a new int array of length n,
        // containing the numbers 0, 1, 2, ... n-1.
        //The given n may be 0, in which case just return a length 0 array.
        // You do not need a separate if-statement for the length-0 case;
        //the for-loop should naturally execute 0 times in that case, so it just works.
        //The syntax to make a new int array is: new int[desired_length] (See also: FizzBuzz Code)
        fizzArray(4);// → [0, 1, 2, 3]
        fizzArray(1);// → [0]
        fizzArray(10);// → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        FillAndPrintIntArray.myPrintIntArray(fizzArray(4));
        FillAndPrintIntArray.myPrintIntArray(fizzArray(1));
        FillAndPrintIntArray.myPrintIntArray(fizzArray(10));
        split();

        System.out.println("файл 19 задача 5");      //!!!!
        //Given an array of ints, return true if it contains no 1's or it contains no 4's.
        int[] arr26 = new int[]{1, 2, 3};
        int[] arr27 = new int[]{4, 5, 6};
        int[] arr28 = new int[]{1, 2, 3, 4};
        System.out.println(no14(arr26));// → true
        System.out.println(no14(arr27));// → false
        System.out.println(no14(arr28));// → true
    }

    private static boolean no14(int[] arr) {
        int countOne = 0;
        int countFour = 0;
        //boolean isOne=false;   второй вариант
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                countOne++;
            }
            if (arr[i] == 4) {
                countFour++;
            }
        }
        return (countOne == 0 || countFour == 0);
    }

    private static int[] fizzArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = i;
        }
        return output;
    }

    private static int[] sumTwo(int[] arr1, int[] arr2) {
        int[] output = new int[arr1.length];
        if (arr1.length >= arr2.length) {
            for (int i = 0; i < arr2.length; i++) {
                output[i] = arr1[i] + arr2[i];
            }
            for (int i = arr2.length; i < arr1.length; i++) {
                output[i] = arr1[i];
            }
        }
        return output;
    }

    private static int[] sumOne(int[] ar1, int[] ar2) {
        int[] output = new int[ar1.length + ar2.length];
        for (int i = 0; i < ar1.length; i++) {
            output[i] = ar1[i];
        }
        for (int i = 0; i < ar2.length; i++) {
            output[ar1.length + i] = ar2[i];
        }
        return output;
    }

    private static int start1(int[] arr1, int[] arr2) {
        int num = 0;
        if (arr1[0] == 1) {
            num = 1;
        }
        if (arr2.length >= 1) {
            if (arr2[0] == 1) {
                num++;
            }

        }
        return num;
    }

    private static int[] makeLast(int[] arr) {
        int[] output = new int[arr.length * 2];
        /*for (int i = 0; i < output.length; i++) {
            output[i]=0;
        }*/
        output[output.length - 1] = arr[arr.length - 1];
        return output;
    }


    /*private static int[] makeEnds(int[] arr) {
        int[] output = new int[]{arr[0], arr[arr.length - 1]{
        }
        }
        return output;
    }*/

    private static int[] maxEnd3(int[] arr) {
        int max = Math.max(arr[0], arr[2]);
        int[] output = new int[]{max, max, max};
        return output;
    }

    private static int[] maxEnd3Other(int[] arr) {
        int a = 0;
        int[] result = new int[arr.length];
        if (arr[0] > arr.length - 1) {
            a = arr[0];
            for (int i = 0; i < arr.length; i++) {
                result[i] = a;
            }
        } else if (arr[0] < arr.length - 1) {
            a = arr.length;
            for (int i = 0; i < arr.length; i++) {
                result[i] = a;
            }
        }
        return result;
    }

    private static int sum3(int[] num) {
        int sum = 0;
        for (int element : num) {

        }
        {

        }

        return sum;
    }

    private static boolean sameFirstLast(int[] num) {

        return num[0] == num[num.length - 1] && num.length >= 1;
    }

    private static boolean unlucky1(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] == 1 && numbers[i + 1] == 3) {
                return true;
            }
        }
        return false;
    }
}

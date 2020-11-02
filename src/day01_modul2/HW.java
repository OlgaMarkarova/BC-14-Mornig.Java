package day01_modul2;

import java.util.Arrays;

public class HW {
        public static void main(String[] args) {
            int[] arr1 = createArrays(5);
            printArrays(arr1);
            int[] arr1_1 = new int[]{1, 2, 3, 4, 5};
            printArrays(arr1_1);
            System.out.println(Arrays.toString(addElementsInArray(arr1_1, 3, 9)));
            int[] arr1_2 = new int[]{6, 5, 4, 3, 8, 2, 1};
            printArrays(arr1_2);
            System.out.println(Arrays.toString(deleteElement(arr1_2, 4)));
            updateElement(arr1_2, 4, 7);
            printArrays(arr1_2);

            char[] arr4 = new char[]{'a', 'f', 't', 'u', 'd'};
            printArrays(arr4);
            int size = 10;
            char[] arr4_1 = new char[size];
            createArrays(arr4_1);
            printArrays(arr4_1);
            char[] arr4_2 = new char[]{'o', 'f', 'e', 'd', 'n', 'y'};
            System.out.println(Arrays.toString(addElementsInArray(arr4_2, 3, 'B')));
            System.out.println(Arrays.toString(deleteElement(arr4_2, 2)));
            updateElement(arr4_2, 2, 'R');
            printArrays(arr4_2);

            double[] arr2 = new double[]{3.6, 7.9, 2.4, 1.5};
            printArrays(arr2);
            int sizeD = 8;
            double[] arr2_2 = new double[sizeD];
            createArrays(arr2_2);
            printArrays(arr2_2);
            double[] arr2_1 = new double[]{5.4, 6.5, 7.6, 8.7, 9.8};
            printArrays(arr2_1);
            System.out.println(Arrays.toString(addElementsInArray(arr2_1, 3, 5.5)));
            System.out.println(Arrays.toString(deleteElement(arr2_1, 2)));
            updateElement(arr2_1, 2, 1.1);
            printArrays(arr2_1);

            long[] arr3 = new long[]{589089089L, 789089089L, 489139089L};
            printArrays(arr3);
            System.out.println(Arrays.toString(addElementsInArray(arr3, 1, 5345981765L)));
            System.out.println(Arrays.toString(deleteElement(arr3, 1)));
            updateElement(arr3, 0, 954473826L);
            printArrays(arr3);
            int sizeArr = 7;
            long[] arr3_1 = new long[sizeArr];
            createArrays(arr3_1);
            printArrays(arr3_1);

            int sizeB = 9;
            byte[] arr5_1 = new byte[sizeB];
            createArrays(arr5_1);
            printArrays(arr5_1);
            System.out.println(Arrays.toString(addElementsInArray(arr5_1,6, (byte) 1)));
            System.out.println(Arrays.toString(deleteElement(arr5_1, 4)));
            updateElement(arr5_1,5, (byte) 4);
            printArrays(arr5_1);
        }

        private static void updateElement(byte[] array,int position, byte newElement) {
            array[position]=newElement;
        }

        public static byte[] deleteElement(byte[] array,int position) {
            byte[] output = new byte[array.length - 1];
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < array.length; i++) {
                output[i - 1] = array[i];
            }
            return output;
        }

        public static byte[] addElementsInArray(byte[] array, int position, byte element) {
            byte[] output = new byte[array.length + 1];
            output[position] = element;
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < output.length; i++) {
                output[i] = array[i - 1];
            }
            return output;
        }

        public static void createArrays(byte[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (byte) (Math.random() * 10);
            }
        }

        public static void printArrays(byte[] array) {
            System.out.println("byte массив");
            for (byte element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void updateElement(long[] array, int position, long newElement) {
            array[position] = newElement;
        }

        public static long[] deleteElement(long[] array, int position) {
            long[] output = new long[array.length - 1];
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < array.length; i++) {
                output[i - 1] = array[i];
            }
            return output;
        }

        public static long[] addElementsInArray(long[] array, int position, long element) {
            long[] output = new long[array.length + 1];
            output[position] = element;
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < output.length; i++) {
                output[i] = array[i - 1];
            }
            return output;
        }

        private static void createArrays(long[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (long) (Math.random() * 50000);
            }
        }

        public static void printArrays(long[] array) {
            System.out.println("long массив");
            for (double element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void updateElement(double[] array, int position, double newElement) {
            array[position] = newElement;
        }

        public static double[] deleteElement(double[] array, int position) {
            double[] output = new double[array.length - 1];
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < array.length; i++) {
                output[i - 1] = array[i];
            }
            return output;
        }

        public static double[] addElementsInArray(double[] array, int position, double element) {
            double[] output = new double[array.length + 1];
            output[position] = element;
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < output.length; i++) {
                output[i] = array[i - 1];
            }
            return output;
        }

        private static void createArrays(double[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = (char) (Math.random() * 10);
            }
        }

        public static void printArrays(double[] arr) {
            System.out.println("double массив");
            for (double element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void updateElement(char[] array, int position, char newElement) {
            array[position] = newElement;
        }

        public static char[] deleteElement(char[] array, int position) {
            char[] output = new char[array.length - 1];
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < array.length; i++) {
                output[i - 1] = array[i];
            }
            return output;
        }

        public static char[] addElementsInArray(char[] array, int position, char element) {
            char[] output = new char[array.length + 1];
            output[position] = element;
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < output.length; i++) {
                output[i] = array[i - 1];
            }
            return output;
        }

        public static void createArrays(char[] arr) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = (char) (Math.random() * 100);
            }
        }

        public static void printArrays(char[] arr) {
            System.out.println("char массив");
            for (char element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        public static void updateElement(int[] array, int position, int newElement) {
            array[position] = newElement;
        }

        public static int[] deleteElement(int[] array, int position) {
            int[] output = new int[array.length - 1];
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < array.length; i++) {
                output[i - 1] = array[i];
            }
            return output;
        }

        public static int[] addElementsInArray(int[] array, int position, int element) {
            int[] output = new int[array.length + 1];
            output[position] = element;
            for (int i = 0; i < position; i++) {
                output[i] = array[i];
            }
            for (int i = position + 1; i < output.length; i++) {
                output[i] = array[i - 1];
            }
            return output;
        }

        public static int[] createArrays(int arrSize) {
            int[] output = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                output[i] = (int) (Math.random() * 10);
            }
            return output;
        }

        public static void printArrays(int[] array) {
            System.out.println("int массив");
            for (int digit : array) {
                System.out.print(digit + ", ");
            }
            System.out.println();
        }
    }


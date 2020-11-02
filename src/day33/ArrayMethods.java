package day33;

public class ArrayMethods {
    //crud-https://ru.wikipedia.org/wiki/CRUD
    public static void main(String[] args) {
        int[] arr1 = createRandomArray(10);
        printArray(arr1);
        int[] arr2 = addElement(arr1, 0, 5);
        printArray(arr2);
        int[] arr3 = addElement(arr1, 5, 120);
        printArray(arr3);
        int[] arr4 = deleteElement(arr3, 6);
        printArray(arr4);
    }

    private static int[] deleteElement(int[] input, int index) {
        int[] output = new int[input.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index + 1; i < input.length; i++) {
            output[i - 1] = input[i];
        }
        return output;
    }

    private static int[] addElement(int[] input, int index, int element) {
        if (index >= input.length) {
            return input;
        }
        int[] output = new int[input.length + 1];
        output[index] = element;
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index + 1; i < output.length; i++) {
            output[i] = input[i - 1];
        }
        return output;
    }

    private static void printArray(int[] input) {
        for (int element : input) {
            System.out.print(element + ", ");
        }
        System.out.println();
    }

    private static int[] createRandomArray(int size) {
        System.out.println(" созданный массив ");
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = (int) (Math.random() * 100);
        }
        return output;
    }
}

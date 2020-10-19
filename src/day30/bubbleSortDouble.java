package day30;

import com.sun.tools.hat.internal.util.ArraySorter;
import day20.FillAndPrintIntArray;

import java.util.Arrays;

public class bubbleSortDouble {
    public static void main(String[] args) {
        double[] myLovelyDoubleArray = new double[]{3.1, 6.18, 18.0, 1.0, 0.5, 100.0};
        System.out.println(Arrays.toString(myLovelyDoubleArray));
        double[] newArray = copyArray(myLovelyDoubleArray);
        bubbleSortDouble(newArray);
        System.out.println(Arrays.toString(newArray));
    }

    private static void bubbleSortDouble(double[] inputArrUnsortit) {
        int count = 0;
        for (int i = 0; i < inputArrUnsortit.length - 1; i++) {
            if (inputArrUnsortit[i] <= inputArrUnsortit[i + 1]) {
                continue;
            }
            double temp = inputArrUnsortit[i];
            inputArrUnsortit[i] = inputArrUnsortit[i + 1];
            inputArrUnsortit[i + 1] = temp;
            count++;
        }
        if (count > 0) {
            bubbleSortDouble(inputArrUnsortit);
        }
    }

    private static double[] copyArray(double[] input) {
        double[] output = new double[input.length];
        for (int i = 0; i < input.length; i++) {
            output[i] = input[i];
        }

        //int count = 0;
        //        //boolean swap=false;
        //        for (int i = 0; i < arrUnsort.length - 1; i++) {
        //            if (arrUnsort[i] > arrUnsort[i + 1]) {
        //                int temp = arrUnsort[i];
        //                arrUnsort[i] = arrUnsort[i + 1];
        //                arrUnsort[i + 1] = temp;
        //                count++;
        //                //swap=true
        //            }
        //        }
        //        if (count > 0) {
        //            bubbleSort(arrUnsort); // метод запускаем после цикла
        //        }
        return output;
    }
}

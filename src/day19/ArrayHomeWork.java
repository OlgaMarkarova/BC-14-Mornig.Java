package day19;

public class ArrayHomeWork {
    public static void main(String[] args) {
        //1. Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
        //Для генерации случайного числа используйте метод Math.random(),
        //который возвращает значение в промежутке [0, 1].
       // System.out.println(homeWork1801());
        myFirstArrayDoublePrint(homeWork1801());
        double[] array = new double[]{5.4, 6.9, 1.3, 2.7, 4.6};
        System.out.println(myMax(array));//6.9
    }

    private static double myMax(double[] anyone) {
        double max=anyone[0];
        for (int i = 0; i < anyone.length; i++) {
            max=Math.max(max,anyone[i]);
            
        }
        return max;
    }

    private static void myFirstArrayDoublePrint(double[] input) {
        for (int i = 0; i < input.length; i++) {
            System.out.println(input[i]);

        }
    }

    private static double[] homeWork1801() {
        double[] output;
        output = new double[10];
        output[1] = 25.85;
        for (int i = 0; i < output.length; i++) {
            //output[i]=25.85;
            output[i] = Math.random();

        }
        return output;
    }
}

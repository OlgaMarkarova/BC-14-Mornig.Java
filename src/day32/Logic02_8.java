package day32;

public class Logic02_8 {
    public static void main(String[] args) {
        //Мы хотим сделать упаковку целых килограммов шоколада.
        //У нас есть маленькие батончики (по 1 кг) и большие (по 5 кг).
        //Возвращает количество используемых маленьких столбцов, предполагая,
        //что мы всегда используем большие столбцы перед маленькими столбцами.
        //Верните -1, если это невозможно.
        System.out.println(makeChocolate(4, 1, 9));// →4
        System.out.println(makeChocolate(4, 1, 10));// →-1
        System.out.println(makeChocolate(4, 1, 7));// →2
        System.out.println(makeChocolate(5, 2, 15));// →5
    }

    private static int makeChocolate(int smallBars, int bigBars, int goal) {


        return -1;
    }
}

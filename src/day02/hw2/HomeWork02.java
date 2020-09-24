package day02.hw2;

public class HomeWork02 {
    public static void main(String[] args) {
        int squareSide1 = 15;
        int squareSide2 = 10;
        square(squareSide1,squareSide2);
        perimeter(squareSide1,squareSide2);
    }
    public static void square(int a, int b) {
        System.out.println("площадь прямоунольника:" + a * b);
    }
    public static void perimeter(int a, int b) {
        System.out.println("периметер прямоугольника:" + 2 * (a + b));
    }
    }

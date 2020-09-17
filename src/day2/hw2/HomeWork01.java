package day2.hw2;

public class HomeWork01 {
    public static void main(String[] args) {
        int squareSide = 15;
        square(squareSide);
        perimeter(squareSide);
    }
    public static void square(int a) {

        System.out.println("площадь кв равна: " + a * a);
    }
    public static void perimeter(int a) {

        System.out.println("периметр квадрата : " + 4 * a);
    }
    }


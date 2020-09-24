package day02.hw2;

public class HomeWork2 {
    public static void main(String[] args) {
// Найти площадь и периметр прямоугольника.
        int firstSide = 10;
        int secondSide = 20;
        findRectangleSquare(firstSide, secondSide);
    }

    private static void findRectangleSquare(int firstSide, int secondSide) {
        System.out.println("Fläche:" + firstSide * secondSide);
    }
}

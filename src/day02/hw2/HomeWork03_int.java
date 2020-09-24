package day02.hw2;

public class HomeWork03_int {
    public static void main(String[] args) {
        int squareSide = 2567;
        square(squareSide);
        perimeter(squareSide);
    }
    public static void square(int a) {
        System.out.println("площадь куба:" + 6 * a * a);
        // S = 6*a2 (степень)
    }
    public static void perimeter(int a) {
        System.out.println("периметр куба:" + 12 * a);
    }
}

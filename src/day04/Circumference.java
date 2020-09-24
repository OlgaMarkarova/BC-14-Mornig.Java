package day04;

public class Circumference {
    public static void main(String[] args) {
        double radius = 10;
        findCF(radius);
        System.out.println(findCF(radius));

    }

    private static double findCF(double myRadius) {
        return 2 * Math.PI * myRadius;
    }
}

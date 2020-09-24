package day04;

public class HW3_1 {
    public static void main(String[] args) {
        int r = 5;
        findCircumference(r);
        int radiusFromKonstantin = 100;


        findCircumference(radiusFromKonstantin);
        double moneyInEuro = 1000;

        currencyConverter(moneyInEuro, 1.1);
    }

    private static void currencyConverter( double euro, double course) {
        System.out.println(euro * course + " - кол-во usd которые получили за - " + euro);
    }

    private static void findCircumference(int radius) {
        // L = 2 PI * R
        double l = 2 * Math.PI * radius;
        System.out.println( l + " - длина окрухности: с радиусом - " + radius);
    }
}

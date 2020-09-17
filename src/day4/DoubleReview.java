package day4;

public class DoubleReview {
    public static void main(String[] args) {
        double pi = Math.PI;
        System.out.println(pi);
       // myLovelyRound(pi);
       // myNotLovelyRound();
        rondNumber3 ();

    }
    private static void rondNumber3() {
        double pi= Math.PI;
        double pi2 = Math.floor(pi);
        System.out.println(pi2);
        double pi3 = Math.ceil(pi);
        System.out.println(pi3);
        double pi4 = Math.round(pi);
        System.out.println(pi4);


    }

    private static void myNotLovelyRound() {
        double pi = Math.PI;
        int newNumber1 = (int) (Math.round(pi * 100) / 100);
        System.out.println(pi);
        // return Math.round(value * scale) / scale;
    }

    private static void myLovelyRound(double number) {
        // метод округл.
        double result = 0.0;
        int k = 100;
        double temp = number * k;
        System.out.println(temp);
        int temp2 = (int) temp;
        System.out.println(temp2);
        result = temp2;
        result = result / k;
        System.out.println(result);
    }
}

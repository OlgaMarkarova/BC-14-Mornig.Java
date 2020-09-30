package day17;

public class HWTernar {
    public static void main(String[] args) {
        System.out.println(getMeMax(15, 5));// → 15
        System.out.println(getMeMax(4, 16));// → 16
        System.out.println(getMeMax(20, 100));// → 100

        System.out.println(getMeMin(15, 45));// →15
        System.out.println(getMeMin(44, 16));// →16
        System.out.println(getMeMin(200, 100));// →100

        //Даны два строковых значения. Верните идущее по алфавиту раньше.
        System.out.println(myFirstCompareTo("Berlin", "Moscow"));// →"Berlin"
        System.out.println(myFirstCompareTo("Minsk", "Moscow"));// →"Minsk"
        System.out.println(myFirstCompareTo("Kyiv", "Paris"));// →"Kyiv"
        System.out.println(myFirstCompareTo("Могилёв", "Потсдам"));// →"Могилёв"

    }

    private static String myFirstCompareTo(String input, String input1) {
        return (input.codePointBefore(1) < input1.codePointBefore(1)) ? input : input1;
    }
    private static int getMeMin(int a, int b) {
        return (a < b) ? a : b;
    }

    private static int getMeMax(int a, int b) {
        return (a > b) ? a : b;
    }
}

package day32;

public class Logic02_7 {
    public static void main(String[] args) {
        //Given three ints, a b c, return true if one of b or c is "close"
        //(differing from a by at most 1), while the other is "far",
        //differing from both other values by 2 or more.
        //Note: Math.abs(num) computes the absolute value of a number.
        //Для трех целых значений, a b c, вернуть true,
        //если одно из значений b или c является «близким» (отличается от a не более чем на 1),
        //а другое - «далеко», отличаясь от обоих других значений на 2 или более.
        //Примечание. Math.abs (num) вычисляет абсолютное значение числа.
        System.out.println(closeFar(1, 2, 10));// → true
        System.out.println(closeFar(1, 2, 3));// → false
        System.out.println(closeFar(4, 1, 3));// → true
    }

    private static boolean closeFar(int a, int b, int c) {
        int diff1 = Math.abs(a - b);
        int diff2 = Math.abs(a - c);
        int diff3 = Math.abs(b - c);
        return diff1 <= 1 && diff2 >= 2 && diff3 >= 2 || diff1 <= 1 && diff2 >= 2 && diff3 >= 2;
    }
}

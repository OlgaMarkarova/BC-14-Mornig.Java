package day07;

public class HW7_1 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));//true
        System.out.println(love6(4, 5));//false
        System.out.println(love6(1, 6));//true

    }

    private static boolean love6(int a, int b) {
        //int f = a - b;
        //System.out.println(Math.abs(f));
        return (a == 6) || (b == 6) || (a + b == 6) || (Math.abs(a-b) == 6);
        //boolean c = (a == 6) || (b == 6) || (a +b == 6) || (Math.abs(f) == 6);
        //return c;
    }
}


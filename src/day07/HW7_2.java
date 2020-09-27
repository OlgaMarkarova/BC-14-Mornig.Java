package day07;

public class HW7_2 {
    public static void main(String[] args) {

        System.out.println(startHi("hi there"));// true
        System.out.println(startHi("hi"));//true
        System.out.println(startHi("hello hi"));//false

    }

    private static boolean startHi(String hi_there) {
        String s1 = hi_there;
        String result = s1.substring(0, 2);
        System.out.println(result);
        boolean c = (result == "hi");
        return c;
    }
}

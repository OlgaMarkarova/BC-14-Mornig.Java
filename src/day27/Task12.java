package day27;

public class Task12 {
    public static void main(String[] args) {
       /*
        1. To define if we have 'xyz'
        2. Find out where 'xyz' is located
        3. Найти кол-во символов до 'xyz'
        4. Найти кол-во символов после 'xyz'
        */
        System.out.println(xyzMiddle("AAxyzBB"));// → true
        System.out.println(xyzMiddle("AxyzBB"));//→ true
        System.out.println(xyzMiddle("AxyzBBB"));// → false
    }

    private static boolean xyzMiddle(String input) {
        String xyz = "xyz";
        int xyzStart = input.indexOf(xyz);
        int xyzEnd = xyzStart + 2;
        int counySymbolsStart = xyzStart;
        int countSymbolEnd = input.length() - 1 - xyzEnd;
        int difference = Math.abs(counySymbolsStart - countSymbolEnd);
        System.out.println("difference "+difference);
        if (difference <= 1) {
            return true;
        }
        return false;
    }
}

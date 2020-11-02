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
        //System.out.println(xyzMiddle("AxyzBB"));//→ true
       // System.out.println(xyzMiddle("AxyzBBB"));// → false
    }

    private static boolean xyzMiddle(String input) {
        String xyz = "xyz";
        int xyzStart = input.indexOf(xyz);
        int xyzEnd = xyzStart + 2;
        int countSymbolsStart = xyzStart;
        int countSymbolEnd = input.length() - 1 - xyzEnd;
        int difference = Math.abs(countSymbolsStart - countSymbolEnd);
        //System.out.println("difference "+difference);
        //System.out.println("input.length() - 1 - xyzEnd "+(input.length() - 1 - xyzEnd));
        //System.out.println("countSymbolsStart "+countSymbolsStart);
        //System.out.println("xyzEnd "+xyzEnd);
        //System.out.println("xyzStart "+xyzStart);
        //System.out.println("input.indexOf(xyz) "+input.indexOf(xyz));
        if (difference <= 1) {
            return true;
        }
        return false;
    }
}

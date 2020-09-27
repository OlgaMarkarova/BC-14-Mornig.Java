package day14;

public class HW14_1 {
    public static void main(String[] args) {
        //myRectangle(4, 4);
        //myThreeangle(10);
        //threeangleOther(10);
        myThreeangleAnother(10);
    }

    private static void myThreeangleAnother(int a) {
        String space = " ";
        String str = "*";
        String line = "";
        String line1 = "";
        for (int k = 0; k < a; k++) {
            line = space + line;
        }
        for (int j = a; j > 0; j--) {
            line1 = line1 + str;
            System.out.println(line.substring(0, j) + line1);
        }
    }

    private static void threeangleOther(int a) {
        String str = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = str + line;
        }
        for (int j = a; j > 0; j--) {
            System.out.println(line.substring(0, j));
        }
    }


    private static void myThreeangle(int a) {
        String str = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = str + line;
            System.out.println(line);
        }
    }

    /*private static void myRectangle(int a, int b) {
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("*-");
            }
            System.out.println("");
            for (int k = 0; k < a; k++) {
                System.out.print("-*");
            }
            System.out.println("");
        }
    }*/
}

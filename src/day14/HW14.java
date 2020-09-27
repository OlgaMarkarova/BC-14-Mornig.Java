package day14;

public class HW14 {
    public static void main(String[] args) {
        myRectangle(4, 4);
        threeAngle(10);
        threeAngleOther(10, 10);
        myThreeangleAnother1(10);
        myThreeangleAnother2(10);
        multiplication();
    }

    private static void multiplication() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int m = i * j;
                String s = " ";
                if (m < 10) {
                    System.out.print(s + s + s + m);
                } else if (m < 99) {
                    System.out.print(s + s + m);
                } else {
                    System.out.println(s + m);
                }
            }
            System.out.println("");
        }

    }

    private static void myThreeangleAnother1(int a) {
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

    private static void myThreeangleAnother2(int a) {
        String space = " ";
        String str = "*";
        String line = "";
        String line1 = "";
        for (int k = 0; k < a; k++) {
            line = space + line;
        }
        for (int j = a; j > 0; j--) {
            line1 = line1 + str + str;
            System.out.println(line.substring(0, j) + line1);
        }
    }

    private static void threeAngleOther(int b, int a) {
        String str = "*";
        String line = "";

        for (int i = 0; i < a; i++) {
            line = str + line;
        }
        for (int j = a; j > 0; j--) {
            System.out.println(line.substring(0, j));

        }

    }

    private static void threeAngle(int a) {
        String str = "*";
        String line = "";
        for (int i = 0; i < a; i++) {
            line = str + line;
            System.out.println(line);
        }
    }

    private static void myRectangle(int a, int b) {
        String c = "+";
        String d = "-";
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print(c+d);
            }
            System.out.println("");
            for (int k = 0; k < a; k++) {
                System.out.print(d+c);
            }
            System.out.println("");
        }
    }
}

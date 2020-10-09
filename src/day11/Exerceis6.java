package day11;

public class Exerceis6 {
    public static void main(String[] args) {
        //нужно написать алгоритм вывода на экран всех
        // возможных комбинаций 3-х натуральных чисел до 36 с определенными условиями:
        //1. необходимо использовать вложенные циклы 2. x <= y <= z
        //3. xyz = 36
        //например:
        //1. x=1, y=1, z=36 2. x=1; y=3; z=12

        //treeNumber();
        threeAngle(10);
       // myRectangie(4, 3);
    }

    private static void myRectangie(int a, int b) {
        for (int i = 0; i <= b; i++) {
            for (int k = 0; k < a; k++) {
                System.out.print("*-");
            }
            System.out.println("");
            for (int j = 0; j < a; j++) {
                System.out.print("-*");
            }
            System.out.println("");
        }
    }



    // шестой файл
    private static void threeAngle(int lines) {
        String star = "*";
        String myLine = "";
        for (int i = 0; i < lines; i++) {
            myLine = myLine + star;
            System.out.println(myLine);
        }
    }


    private static void treeNumber() {
        for (int x = 0; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println("Вариант, где " + "x=" + x + ",y=" + y + ",  z=" + z);
                    }
                }

            }

        }
    }

}

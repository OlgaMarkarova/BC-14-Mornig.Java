package day11;

public class Exerceis6 {
    public static void main(String[] args) {
        //нужно написать алгоритм вывода на экран всех
        // возможных комбинаций 3-х натуральных чисел до 36 с определенными условиями:
        //1. необходимо использовать вложенные циклы 2. x <= y <= z
        //3. xyz = 36
        //например:
        //1. x=1, y=1, z=36 2. x=1; y=3; z=12

        treeNumber();
        threeAngle();
    }

    private static void threeAngle() { // шестой файл
    }

    private static void treeNumber() {
        for (int x = 0; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println("Вриант, где " + "x=" + x + ",y=" + y + ",  z=" + z);
                    }
                }

            }

        }
    }

}

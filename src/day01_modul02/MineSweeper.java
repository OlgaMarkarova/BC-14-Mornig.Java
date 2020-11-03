package day01_modul02;

public class MineSweeper {
    static int bomb = -1;

    public static void main(String[] args) {
        int[][] gameField = createStage(10);
        //1. делаем поле
        //2.выводим на экран, проверяем
        //3.расставляем бомбы
        //4.расставить счетчик вокруг бомб
        //а)если бомба, то проверь каждую прилегающую клетку,если не бомба, каунтим ++
        //

    }

    private static int[][] createStage(int size) {
        int[][] result = new int[size][size];
        //displayField(result);
        int perCentBomb = 10;
        setBomb(result, perCentBomb);
        setDigits(result);
        return result;
    }

    private static void setDigits(int[][] field) {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == bomb) {
                    countCell(field, i, j);
                }
            }
        }
    }

    private static void countCell(int[][] field, int x, int y) {
        // 1. Верх лево
        if (x - 1 >= 0 && y - 1 >= 0 && field[x - 1][y - 1] != bomb) {
            field[x - 1][y - 1]++;
        }
        // 2. Верх середина
        if (x - 1 >= 0 && field[x - 1][y] != bomb) {
            field[x - 1][y]++;
        }
        // 3. Верх право
        if (x - 1 >= 0 && y + 1 < field[x].length && field[x - 1][y + 1] != bomb) {
            field[x - 1][y + 1]++;
        }

        // 4. Середина лево
        if (y - 1 >= 0 && field[x][y - 1] != bomb) {
            field[x][y - 1]++;
        }
        // 5. Середина право
        if (y + 1 < field[x].length && field[x][y + 1] != bomb) {
            field[x][y + 1]++;
        }
        // 6. Низ лево
        if (x + 1 < field.length && y - 1 >= 0 && field[x + 1][y - 1] != bomb) {
            field[x + 1][y - 1]++;
        }
        // 7. Низ середина
        if (x + 1 < field.length && field[x + 1][y] != bomb) {
            field[x + 1][y]++;
        }

        // 8. Низ право
        if (x + 1 < field.length && y + 1 < field[x].length && field[x + 1][y + 1] != bomb) {
            field[x + 1][y + 1]++;
        }

        displayField(field);
    }

    private static void setBomb(int[][] arr, int perCent) {
        int countBomb = arr.length * arr.length * perCent / 100;
        for (int i = 0; i < countBomb; i++) {
            int x = (int) (Math.random() * arr.length);
            int y = (int) (Math.random() * arr.length);
            if (arr[x][y] != bomb) {
                arr[x][y] = bomb;
            } else {
                i--;//чтобы попытка не сгорела
            }

        }
        displayField(arr);
    }

    private static void displayField(int[][] arr) {
        System.out.println("Вывод двумерного массива");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                //System.out.print(arr[i][j] + " ");
                System.out.printf("%3s", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println("Вывод массива закончен");
        System.out.println();
    }
}


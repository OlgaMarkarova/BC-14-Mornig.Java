package day33;

public class MinesSwiper {
    public static void main(String[] args) {
        //минное поле
        //10X10 на нем должно быть 10% бомбочек
        // String [][] :обычное поле - пробелы или минусы, а бомбочки - звездочки
        String[][] miner = new String[10][10];
        createMinesSwiper(miner, 10);
        printMySwiper(miner);
    }

    private static void printMySwiper(String[][] miner) {
        for (String[] simpleArray : miner) {
            for (String element : simpleArray) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    private static void createMinesSwiper(String[][] miner, int persent) {
        int fieldCount = miner.length * miner[0].length;
        //System.out.println(fieldCount);
        int bombCount = fieldCount * persent / 100;
        String bomb = "*";
        String empty = "-";
        for (int i = 0; i < miner.length; i++) {
            for (int j = 0; j < miner[i].length; j++) {
                miner[i][j] = empty;
            }
        }
        int count = 0;
        while (count < bombCount) {
            int x = (int) (Math.random() * miner.length);
            int y = (int) (Math.random() * miner[x].length);
            if (!(miner[x][y].equals(bomb))) {
                miner[x][y] = bomb;
                count++;
            }
        }
    }
}

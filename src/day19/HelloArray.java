package day19;

public class HelloArray {
    public static void main(String[] args) {
        helloMyFirstArray();
        //oldDeclaration();
        arrayInitialisation();

        germanCities();
        intArrayGame();

    }

    private static void intArrayGame() {
        int[] field = new int[]{15, 15, 3, 67, 90};
        int[] testArray = new int[]{67, 90};
        //int size = field.length;
        //System.out.println("кол-во int "+ size);

        System.out.println(field[3]);   //это 67
        System.out.println(field[3] + "," + field[4]);   //это 67,90
        System.out.println("[" + field[3] + ", " + field[4] + "]"); // 67,90
    }

    private static void germanCities() {
        String[] germanCity = new String[]{"Berlin", "München", "Dresden", "Leipzig", "Hamburg", "Frankfurt"};
        int size = germanCity.length;
        System.out.println("Кличество городов: " + size);
        int countLetter = 0;
        for (int i = 0; i < size; i++) {
            countLetter = countLetter + germanCity[i].length();
            System.out.println(countLetter);
        }
        System.out.println("Колличество всех букв: " + countLetter);

    }

    private static void arrayInitialisation() {
        int[] field;
        field = new int[10]; //в массиве 10 ячеек камеры хранения

        String[] fourSeasons = new String[]{"Vivaldi", "Tchaikovski", "Astor Piazzolla", "Stephen Edwin King"};
        int[] numberFibonacci = new int[]{0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55};
        String[] germanCity = new String[]{"Berlin", "München", "Dresden", "Leipzig", "Hamburg"};
    }

    private static void oldDeclaration() {
        // dataType array/name [};
    }

    private static void helloMyFirstArray() {
        int[] myFirstArray;

        // dataType[] array/name;
        String[] myFirstArrayString;
        double[] gpsPoints;
        boolean[] permissions;
        char[] symbols;

    }
}

package day07_modul02;

public class test {
    public static void main(String[] args) {
        //Учитывая два массива целых чисел, отсортированных в порядке возрастания,
        // внешний и внутренний, верните true, если все числа из внутреннего появляются во внешнем.
        // Лучшее решение делает только один «линейный» проход обоих массивов,
        // используя тот факт, что оба массива уже отсортированы.
        int[] arr4 = new int[]{1, 2, 4, 6};
        int[] arr4_1 = new int[]{2, 4};
        int[] arr5 = new int[]{1, 2, 4, 6};
        int[] arr5_1 = new int[]{2, 3, 4};
        int[] arr6 = new int[]{1, 2, 4, 4, 6};
        int[] arr6_1 = new int[]{2, 4};
        System.out.println(linearIn(arr4, arr4_1));//→ true
        System.out.println(linearIn(arr5, arr5_1));// → false
        System.out.println(linearIn(arr6, arr6_1)); //→ true
    }

    private static boolean linearIn(int[] array1, int[] array2) {
        for (int i = 1; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] || array1[i] == array2[j + 1]) {
                    return true;
                }
            }
        }
        return false;
    }
}

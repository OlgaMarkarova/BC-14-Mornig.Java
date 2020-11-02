package day34;

import java.util.Arrays;

import static day07.Logik01.split;

public class Arrays_repeat {
    public static void main(String[] args) {
        //Вернуть массив, который содержит те же числа, что и данный массив, но переупорядочен так,
        //чтобы все четные числа стояли перед всеми нечетными числами.
        //Кроме этого, числа могут быть в любом порядке.
        //Вы можете изменить и вернуть данный массив или создать новый массив.
        int[] arr1 = new int[]{1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = new int[]{3, 3, 2};
        int[] arr3 = new int[]{2, 2, 2};
        System.out.println(Arrays.toString(evenOdd(arr1)));// → [0, 0, 0, 1, 1, 1, 1]
        System.out.println(Arrays.toString(evenOdd(arr2)));// → [2, 3, 3]
        System.out.println(Arrays.toString(evenOdd(arr3)));// → [2, 2, 2]
        split();
        System.out.println("Arras 19_1");
        //Вернуть количество четных целых чисел в данном массиве.
        //Примечание: оператор% "mod" вычисляет остаток, например 5% 2 это
        int[] arr4 = new int[]{2, 1, 2, 3, 4};
        int[] arr5 = new int[]{2, 2, 0};
        int[] arr6 = new int[]{1, 3, 5};
        System.out.println(countEvens(arr4));//→ 3
        System.out.println(countEvens(arr5));// → 3
        System.out.println(countEvens(arr6));//→ 0
        split();
        System.out.println("Arras 19_2");
        //Возвращает сумму чисел в массиве,
        //возвращая 0 для пустого массива. За исключением того,
        //что число 13 очень неудачно, поэтому оно не считается, и числа,
        //следующие сразу после 13, также не считаются.
        int[] arr7 = new int[]{1, 2, 2, 1};
        int[] arr8 = new int[]{1, 1};
        int[] arr9 = new int[]{1, 2, 2, 1, 13};
        System.out.println(sum13(arr7));// → 6
        System.out.println(sum13(arr8));// → 2
        System.out.println(sum13(arr9));// → 6
        split();

        System.out.println("Arras 19_3");
        //Для массива целых чисел верните истину, если в массиве нет ни единиц, ни троек.
        int[] arr10 = new int[]{0, 2, 4};
        int[] arr11 = new int[]{1, 2, 3};
        int[] arr12 = new int[]{1, 2, 4};
        System.out.println(lucky13(arr10));// → true
        System.out.println(lucky13(arr11));// → false
        System.out.println(lucky13(arr12));// → false
        split();

        System.out.println("Arras 19_4");
        //Дано число n, создайте и верните новый массив int длины n,
        //содержащий числа 0, 1, 2, ... n-1.
        //Заданное n может быть 0, и в этом случае просто вернуть массив длины 0.
        //Вам не нужен отдельный оператор if для случая length-0;
        //в этом случае цикл for должен, естественно, выполняться 0 раз,
        //поэтому он просто работает.
        //Синтаксис для создания нового массива int: новый int [желаемая_ длина]
        //(см. Также: Код FizzBuzz)
        System.out.println(Arrays.toString(fizzArray(4)));// → [0, 1, 2, 3]
        System.out.println(Arrays.toString(fizzArray(1)));// → [0]
        System.out.println(Arrays.toString(fizzArray(10)));// → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        split();

        System.out.println("Arras 19_5");
        int[] arr13 = new int[]{1, 2, 3};
        int[] arr14 = new int[]{1, 2, 3, 4};
        int[] arr15 = new int[]{2, 3, 4};
        System.out.println(no14(arr13));// →true
        System.out.println(no14(arr14));// →false
        System.out.println(no14(arr15));// →true
        split();

        System.out.println("Arras 19_6");
        //Учитывая массивы nums1 и nums2 одинаковой длины,
        //для каждого элемента в nums1 рассмотрим соответствующий элемент в nums2 (с тем же индексом).
        //Возвращает количество раз, когда два элемента отличаются на 2 или меньше, но не равны.
        int[] arr16 = new int[]{1, 2, 3};
        int[] arr16_1 = new int[]{2, 3, 10};
        int[] arr17 = new int[]{1, 2, 3};
        int[] arr17_1 = new int[]{2, 3, 5};
        int[] arr18 = new int[]{1, 2, 3};
        int[] arr18_1 = new int[]{2, 3, 3};
        System.out.println(matchUp(arr16, arr16_1));// → 2
        System.out.println(matchUp(arr17, arr17_1));// → 3
        System.out.println(matchUp(arr18, arr18_1));// → 2
        split();

        System.out.println("Arras 19_7");
        //Для массива целых чисел вернуть true,
        //если массив содержит 3 четных или 3 нечетных значения,
        //расположенных рядом друг с другом.
        int[] arr19 = new int[]{2, 1, 3, 5};
        int[] arr20 = new int[]{2, 1, 2, 5};
        int[] arr21 = new int[]{2, 4, 2, 5};
        System.out.println(modThree(arr19));// → true
        System.out.println(modThree(arr20));// → false
        System.out.println(modThree(arr21));// → true
        split();

        System.out.println("Arras 19_8");
        //Верните истину, если группа из N чисел в начале и в конце массива одинакова.
        //Например, для {5, 6, 45, 99, 13, 5, 6} концы одинаковы для n = 0 и n = 2
        //и ложны для n = 1 и n = 3. Вы можете предположить,
        //что n находится в диапазоне 0..nums.length включительно.
        int[] arr22 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr23 = new int[]{5, 6, 45, 99, 13, 5, 6};
        int[] arr24 = new int[]{5, 6, 45, 99, 13, 5, 6};
        System.out.println(sameEnds(arr22, 1));// →false
        System.out.println(sameEnds(arr23, 2));// →true
        System.out.println(sameEnds(arr24, 3));// →false
        split();

        System.out.println("Arras 19_9");
        //Возвращает массив, который "сдвинут влево" на единицу,
        //поэтому {6, 2, 5, 3} возвращает {2, 5, 3, 6}.
        //Вы можете изменить и вернуть данный массив или вернуть новый массив.
        int[] arr25 = new int[]{6, 2, 5, 3};
        int[] arr26 = new int[]{1, 2};
        int[] arr27 = new int[]{1};
        System.out.println(Arrays.toString(shiftLeft(arr25)));// → [2, 5, 3, 6]
        System.out.println(Arrays.toString(shiftLeft(arr26)));// → [2, 1]
        System.out.println(Arrays.toString(shiftLeft(arr27)));// → [1]
        split();

        System.out.println("Arras 19_10");
        //Учитывая непустой массив целых чисел, верните новый массив,
        //содержащий элементы из исходного массива,
        //которые идут после последних 4 в исходном массиве.
        //Исходный массив будет содержать по крайней мере один 4.
        //Обратите внимание, что в java можно создать массив длиной 0.
        int[] arr28 = new int[]{2, 4, 1, 2};
        int[] arr29 = new int[]{4, 1, 4, 2};
        int[] arr30 = new int[]{4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(post4(arr28)));// → [1, 2]
        System.out.println(Arrays.toString(post4(arr29)));// → [2]
        System.out.println(Arrays.toString(post4(arr30)));// → [1, 2, 3]
        split();

        System.out.println("Arras 19_11");
        //Вернуть версию данного массива, из которой удалены все 10.
        //Остальные элементы должны сдвинуться влево к началу массива по мере необходимости,
        //а пустые места в конце массива должны быть 0.
        //Таким образом, {1, 10, 10, 2} дает {1, 2, 0, 0}.
        //Вы можете изменить и вернуть данный массив или создать новый массив.
        int[]arr31=new int[]{1, 10, 10, 2};
        int[]arr32=new int[]{10, 2, 10};
        int[]arr33=new int[]{1, 99, 10};
        System.out.println(Arrays.toString(withoutTen(arr31)));// → [1, 2, 0, 0]
        System.out.println(Arrays.toString(withoutTen(arr32)));// → [2, 0, 0]
        System.out.println(Arrays.toString(withoutTen(arr33)));// → [1, 99, 0]
        System.out.println("deleteElement");

    }
    private static int[] deleteElement(int[] input, int index) {
        int[] output = new int[input.length - 1];
        for (int i = 0; i < index; i++) {
            output[i] = input[i];
        }
        for (int i = index + 1; i < input.length; i++) {
            output[i - 1] = input[i];
        }
        return output;
    }

    private static int[] withoutTen(int[] input  ) {
        int[]output=new int[input.length];
        int indexTen=0;
        for (int i = 0; i < input.length; i++) {
            if (i==10){
                output[i]=0;
                break;
            }
        }
        return output;
    }

    private static int[] post4(int[] input) {
        int indexFor = 0;
        for (int i = input.length-1; i >=0; i--) {
            if (input[i] == 4) {
                indexFor = i;
                break;
            }
        }
        int size = input.length - indexFor - 1;
        int[] output = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            output[i] = input[input.length + i - size];
            for (int j = 0; j < size; j++) {
                output[i] = input[i + indexFor + 1];
            }
           // System.out.println("output[i]= "+ input[input.length + i - size]);
        }
        //System.out.println("size= " + (input.length - (indexFor - 1)));
       // System.out.println("indexFor= "+ indexFor);
       // System.out.println("input.length="+input.length);
        return output;
    }

    private static int[] shiftLeft(int[] input) {
        int[] output = new int[input.length];
        for (int i = 1; i < input.length; i++) {
            output[i - 1] = input[i];
        }
        output[output.length - 1] = input[0];
        return output;
    }

    private static boolean sameEnds(int[] input, int n) {
        for (int i = 0; i < n; i++) {
            //if (input[i] != input[input.length - n + i]
            if (input[i] == input[input.length - n] && input[i + 1] == input[input.length - n + 1]) {
                return true;
            }
        }
        return false;
    }

    private static boolean modThree(int[] input) {
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                count1++;
            }
            if (input[i] % 2 != 0) {
                count2++;
            }
            if (count1 == 3 || count2 == 3) {
                return true;
            }
        }
        return false;
    }

    private static int matchUp(int[] nums1, int[] nums2) {
        int difference = 0;
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            difference = Math.abs(nums1[i] - nums2[i]);
            if (difference == 2 || difference == 1) {
                count++;
            }
        }
        return count;
    }

    private static boolean no14(int[] input) {
        int count1 = 0;
        int count4 = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1) {
                count1++;
            }
            if (input[i] == 4) {
                count4++;
            }
        }
        if (count1 == 0 || count4 == 0) {
            return true;
        }
        return false;
    }

    private static int[] fizzArray(int n) {
        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            output[i] = i;
        }
        return output;
    }

    private static boolean lucky13(int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 1 || input[i] == 3) {
                return false;
            }
        }
        return true;
    }

    private static int sum13(int[] input) {
        int sum = 0;
        int unlucky = 13;
        for (int i = 0; i < input.length; i++) {
            sum += input[i];
            if (input[i] >= unlucky) {
                sum = sum - unlucky;
            }
        }
        return sum;
    }

    private static int countEvens(int[] input) {
        int count = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    private static int[] evenOdd(int[] input) {
        int[] output = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                output[i] = input[i];
            }
            if (input[i] % 2 != 0) {

            }
        }
        return output;
    }
}

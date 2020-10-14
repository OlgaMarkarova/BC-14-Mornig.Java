package day27;

public class Task13 {
    public static void main(String[] args) {
        //Дан String вычислите новый String, переместив первый Char после следующих двух Char,
        //так что «abc» даст «bca». Повторите этот процесс для каждой последующей группы из 3 char,
        //поэтому "abcdef" дает "bcaefd". Игнорируйте любую группу из менее чем 3 символов в конце.

        System.out.println(oneTwo("abc"));// →"bca"
        System.out.println(oneTwo("tca"));// →"cat"
        System.out.println(oneTwo("tcagdo"));// →"catdog"
    }

    private static String oneTwo(String input) {
        String result = "";
        for (int i = 0; i < input.length() - 2; i += 3) {
            System.out.println("i= " + i);
            result += input.substring(i + 1, i + 3) + input.charAt(i);
        }
        // String str = input.substring(0, 3);
        return result;
    }


}

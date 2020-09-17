package day9;

public class ClassWorkFor {
    public static void main(String[] args) {
        int lines = 10;
        //triangle(lines);
        simleString();
        System.out.println("Итоговый вывод" + sum(2, 4));
        System.out.println("Итоговый вывод" + sum(0, 10));
    }

    private static int sum(int a, int b) {
        int result = 0;
        for (int i = a; i <= b; i++) {
            result = result + i;
            System.out.println("Временный вывод результата" + result);
        }
        return result;
    }

    private static void simleString() {
        String text = "One Word";
        text = text + "two";
        System.out.println(text);
    }

    private static void triangle(int number) {
        String star = "*";
        String line = "";
        for (int i = 0; i < number; i++) {
            //line=line+star;
            line = line + star;
            System.out.println("line");
        }
    }
}

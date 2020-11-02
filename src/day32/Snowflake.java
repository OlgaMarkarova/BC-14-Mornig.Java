package day32;

public class Snowflake {
    public static void main(String[] args) {
        makeSnowflake(15);
    }

    private static void makeSnowflake(int number) {
        if (number % 2 == 0) {
            number = number + 1;
        }
        String line = "";
        String x = " X ";
        for (int i = 0; i < number; i++) {
            //1. нарисовать первую линию
            //2.нарисовать вторую линию
            //3.нарисовать третью линию
            //4.нарисовать четвертую линию
            for (int j = 0; j < number; j++) {
                if (i == number / 2 || j == number / 2 || i == j || i == number - j - 1) {
                    //if (i == j || i == number - j - 1)
                    System.out.print(x);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}

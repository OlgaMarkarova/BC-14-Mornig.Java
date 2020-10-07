package day22;

public class germanCites {
    public static void main(String[] args) {
        //Напишите метод печати для строкового массива (String[] germanCites)
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";

        String[] myCites = new String[]
                {
                        "Berlin",
                        "München",
                        "Dresden",
                        "Hamburg",
                        "Potsdam"
                };
        myPrintStringArray(myCites);
        myPrintForI(myCites);
        myColorPrintStringArray(myCites);
    }

    public static void myColorPrintStringArray(String[] arr) {
        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_BLACK = "\u001B[30m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_GREEN = "\u001B[32m";
        final String ANSI_YELLOW = "\u001B[33m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_CYAN = "\u001B[36m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
        final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
        final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";

        System.out.print(ANSI_YELLOW_BACKGROUND + "[ " + ANSI_RESET);

        for (int i = 0; i < arr.length - 1; i++) {
            if (i % 2 == 0) {
                System.out.print(ANSI_RED + ANSI_CYAN_BACKGROUND + arr[i] + "," + ANSI_RESET);
            } else {
                System.out.print(ANSI_GREEN + arr[i] + "," + ANSI_RESET);
            }
        }
        System.out.print(ANSI_PURPLE_BACKGROUND + arr[arr.length - 1] + ANSI_RESET);
        System.out.println(ANSI_YELLOW_BACKGROUND + " ]" + ANSI_RESET);
        {

        }
    }

    public static void myPrintForI(String[] myCities) {
        System.out.print("[ ");
        for (int i = 0; i < myCities.length - 1; i++) {
            System.out.print(myCities[i] + ",");
        }
        System.out.print(myCities[myCities.length - 1]);
        System.out.println("]");
    }

    public static void myPrintStringArray(String[] input) {
        System.out.print("[ ");
        for (String element : input) {
            System.out.print(element + " ");
        }
        System.out.println("]");
    }
}


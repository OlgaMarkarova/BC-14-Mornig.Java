package day17;

public class ReviewCasting {
    public static void main(String[] args) {
        //любой char умещается в int
        //intToChar();
        //charToInt();
        //stringToChar();
        //stringToInt();
        //intToString();
        //charToString();
        magicChar();
    }

    private static void magicChar() {
        char c1 = 'я';
        System.out.println(c1);//я
        System.out.println(c1 + "");//я
        System.out.println("" +c1);//я
        System.out.println(c1+c1+""); //сложение
        System.out.println(c1+10);//1103+10
        System.out.println(c1 + "" + c1);//яя
        System.out.println("" + c1 + c1);//яя
        System.out.println('я'+'я'); // два символа складываются
        System.out.println("я"+"я");
        System.out.println(c1+0); //насильное кастование
        System.out.println(""+c1*c1);
    }

    private static void charToString() {
        char c1 = 125;
        String s1 = String.valueOf(c1);
        String s2 = "" + c1;
        String s3 = "";
        s3 += c1;
        s3 = s3 + c1;
        System.out.println(s1);
        System.out.println(s2);
    }

    private static void intToString() {
        int x = 25;
        String x25 = String.valueOf(x);
        System.out.println(x25);
    }

    private static void stringToInt() {
        String hm = "Василий";
        String database = "1975";
        int newDatabase = Integer.parseInt(database);
        System.out.println(newDatabase);
    }

    private static void stringToChar() {
        String symbol = "$";
        char symbol2 = '€';
        String hm = "Василий";
        char c1 = hm.charAt(0);
        System.out.println(c1);
    }

    private static void charToInt() {
        char c1 = 'ж';
        char c2 = '\u039A';
        char c3 = 100;
        int x = c1;
        short s = (short) c2;
        byte b = (byte) c3;
        double d = c1;
        System.out.println(x);
    }

    private static void intToChar() {
        int x = 90;
        byte b = 100;
        char xyz = (char) b;
        char c = (char) x;
        System.out.println(c);
    }
}


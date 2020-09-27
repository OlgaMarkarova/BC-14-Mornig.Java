package day05;

public class ClassWork {
    public static void main(String[] args) {
        String s1 = "Andrej";
        String s2 = "Sergey";
        System.out.println(helloName(s1));
        System.out.println(helloName("Sergej"));
       /* System.out.println(helloName("Andrej"));
        System.out.println(helloName("Sergej"));
        System.out.println(helloName(s2));
        System.out.println(helloName("Anna Sergeevna"));*/

        System.out.println("bruttoPreis " + pirogiPreis(3)+ '$');

    }

    public static double pirogiPreis(double nettoPreis) {
        double mwst = 5;
        double result = nettoPreis * mwst / 100 + nettoPreis;
        return result;
    }

    private static String helloName(String userName) {
        return "Hello" + userName;
    }
}

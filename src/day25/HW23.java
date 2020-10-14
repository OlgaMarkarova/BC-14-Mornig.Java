package day25;

public class HW23 {
    public static void main(String[] args) {
        System.out.println(repeatSeparator("Word", "X", 3));// → "WordXWordXWord"
        System.out.println(repeatSeparator("This", "And", 2));// → "ThisAndThis"
        System.out.println(repeatSeparator("This", "And", 1));// → "This"

        System.out.println(getSandwich("breadjambread"));// → "jam"
        System.out.println(getSandwich("xxbreadjambreadyy"));// → "jam"
        System.out.println(getSandwich("xxbreadyy"));//     ""

        System.out.println(zipZap("zipXzap"));// → "zpXzp"
        System.out.println(zipZap("zopzop"));// → "zpzp"
        System.out.println(zipZap("zzzopzop"));// → "zzzpzp"
    }

    private static String zipZap(String str) {
        String output = str;
        for (int i = 1; i < output.length() - 1; i++) {
            if (output.charAt(i - 1) == 'z' && output.charAt(i + 1) == 'p') {
                output = output.substring(0, i) + output.substring(i + 1);
            }
        }
        return output;
    }

    private static String zipZapRegX(String str) {
        String output = "";
        output = str.replaceAll("z.p", "zp");
        return output;
    }

    private static String repeatSeparator(String str1, String str2, int numer) {
        String outputStr = "";
        for (int i = 0; i < numer - 1; i++) {
            outputStr += str1 + str2;
        }
        outputStr += str1;
        return outputStr;

    }

    private static String getSandwich(String str) {
        String output = "";
        int indexStart = 0;
        String bread = "bread";
        indexStart = str.indexOf(bread);
        // System.out.println("indexStart= "+str.indexOf(bread));
        int indexEnd = str.lastIndexOf(bread);
        //System.out.println("indexend= "+indexEnd);

        if (indexEnd != indexStart) {
            output = str.substring(indexStart + bread.length(), indexEnd);
        }
        return output;
    }

}



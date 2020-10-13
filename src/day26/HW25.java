package day26;

public class HW25 {
    public static void main(String[] args) {
        //codePointCount(int beginIndex,int endIndex);
        String test = "Вааасилий";
        System.out.println(test.codePointCount(2, 5));
        magicCharArray();
        printCharArray(magicCharArray());
    }

    private static char[] magicCharArray() {
        String haysmaster = "Василий";
        char[] myNewArray = haysmaster.toCharArray();
    return myNewArray;
    }

    public static void printCharArray(char[] arr) {
        for (char element : arr) {
            System.out.print(element + " ");
        }
    }
}

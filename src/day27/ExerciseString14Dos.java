package day27;

public class ExerciseString14Dos {
    public static void main(String[] args) {
        System.out.println(starOut("ab*cd"));// → "ad"
        System.out.println(starOut("ab**cd"));// → "ad"
        System.out.println(starOut("sm*eilly"));// → "silly"
    }
    private static String starOut(String input) {
        String output = "";
        char star = '*';
        int x1 = input.indexOf(star);
        int x2 = input.lastIndexOf(star);
        output = input.substring(0, input.indexOf(star) - 1) + input.substring(input.lastIndexOf(star) + 2);
        return output;
    }
}

/*        if (x2 == x1) {
            output = input.substring(0, x1 - 1) + input.substring(x1 + 2);
        } else{
            output = input.substring(0, x1 - 1) + input.substring(x2 + 2);
        }*/

/*        for (int i = 0; i < output.length(); i++) {
            if (output.charAt(i) == star && output.charAt(i + 1) != star) {
                output = output.substring(0, star - 1) + output.substring(star + 1);
            }
        }*/




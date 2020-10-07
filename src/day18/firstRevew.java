package day18;

public class firstRevew {
    public static void main(String[] args) {
        firstReview();
    }

    private static void firstReview() {
        String hm = "Василия";
  /*      System.out.println(hm.indexOf(1103));
        System.out.println(hm.indexOf('я'));
        System.out.println(hm.codePointAt(6));
        System.out.println('ю' + 0);*/

        if (hm.codePointAt(6) == 'я') {
            System.out.println("popal");
        }

    }
}

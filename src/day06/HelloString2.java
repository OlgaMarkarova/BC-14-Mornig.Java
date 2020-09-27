package day06;

public class HelloString2 {
    public static void main(String[] args) {
        /*String poema = "Я памятник-себе воздвиг нерукотворный";
        int dlina = poema.length(); //рассчитать длину string
        System.out.println(dlina);
        String preview = poema.substring(0, 10);
        System.out.println(preview + "...");
        String end = poema.substring(dlina - 10);
        System.out.println(end);
        char test = poema.charAt(0);
        char test2 = poema.charAt(dlina - 1);
        System.out.println(test);
        System.out.println(test2);*/

        String name = "Василий";
        int dlina1 = name.length();
        //System.out.println(dlina1);
        String part = name.substring(2,5);
        String part2 = name.substring(0,5);
        //System.out.println(part2);
        System.out.println(part);
        String part1 = name.substring(4);
        //System.out.println(part1);
    }
    }


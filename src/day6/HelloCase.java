package day6;

public class HelloCase {
    public static void main(String[] args) {
        String phrase1 = "london is the capital of great britain";
        System.out.println(phrase1);
        String phrase2 = phrase1.toUpperCase();
        System.out.println(phrase2);
        String phrais3 = phrase1.substring(0, 1).toUpperCase()
                + phrase1.substring(1).toLowerCase();
        //toLowerCase() - можно не писать, все буквы уже маленькие
        System.out.println(phrais3);

        String teacher = "Андрей";
        System.out.println(teacher.toUpperCase());
        System.out.println(teacher.toLowerCase());

    }
}

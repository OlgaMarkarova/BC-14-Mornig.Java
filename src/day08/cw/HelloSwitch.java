package day08.cw;

public class HelloSwitch {
    public static void main(String[] args) {
        int schoolNote = 4;
        System.out.println(bonus(schoolNote));

        bonus(schoolNote);
    }

    private static String bonus(int note) {
        String output = "";
        switch (note) {
            case 5:
                output = "Велосипед";
                break;
            case 4:
                output = "GoPro7";
                break;
            case 3:
                output = "Награды не будет";
                break;
            case 2:
                output = "Потерянный час времени";
                break;
            case 1:
                output = "лучше и не спрашивай";
                break;
            default:
                output = "Такой оценки не существует";
                break;

        }

        return output;
    }
}

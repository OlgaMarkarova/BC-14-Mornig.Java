package day07;

public class Logic01Two {
    public static void main(String[] args) {
        System.out.println(doorbell(true, true));// ->false
        System.out.println(doorbell(false, false));// ->false
        System.out.println(doorbell(true, false));// -> true
        boolean electro = true;
        boolean internet = true;
        System.out.println(smartDoorCheckKey(true, true));
        System.out.println(smartDoorCheckKey(true, false));
        System.out.println(smartDoorCheckKey(false, true));
        System.out.println(smartDoorCheckKey(false, false));
    }

    private static boolean smartDoorCheckKey(boolean electro, boolean internet) {
        return !(electro || internet);
    }

    private static boolean doorbell(boolean bellOne, boolean bellTow) {
        return bellOne ^ bellTow;

    }

}

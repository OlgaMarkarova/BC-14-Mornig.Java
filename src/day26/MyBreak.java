package day26;

public class MyBreak {
    public static void main(String[] args) {
boolean permission=true;
    }

    public static void quarantine(boolean quarant) {
        quarantineZone:
        {
            if (quarant) {
                break quarantineZone;
            }
        }
    }
}

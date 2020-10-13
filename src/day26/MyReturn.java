package day26;

public class MyReturn {
    public static void main(String[] args) {
      boolean permission = true;
       boolean notPermission=false;
        quarantine(notPermission);
        quarantine(permission);
    }

    public static void quarantine(boolean quarant) {
     quarantineZone:
     {
         if (quarant){
             return; //выход из программы
         }
         System.out.println("Мы в карантине");
     }
    }
}

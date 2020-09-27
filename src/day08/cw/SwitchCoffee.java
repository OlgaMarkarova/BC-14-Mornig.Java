package day08.cw;

public class SwitchCoffee {
    public static void main(String[] args) {
        int button =5;// номер кнопки в вендмаш
        vendingMachine(button);
    }

    private static void vendingMachine(int customerChoose) {
        switch (customerChoose){
            case 1:
                System.out.println("Кофе американо готовится");
                break;
            case 2:
                System.out.println("Кипяток кипятится");
                break;
            case 3:
                System.out.println("Кофе эспрессо готовится");
                break;
            case 4:
                System.out.println("Какао уже в пути");
                break;
            case 5:
                System.out.println("Вода кипятится");
                System.out.println("Кофе мелится");
                System.out.println("Сливки добавляются");
                break;
            default:
                System.out.println(
                        "Повторите свой выбор,"+ customerChoose
                        + "временно не доступен"
                );
                break;
        }
    }

}

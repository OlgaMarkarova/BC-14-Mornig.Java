package day05_modul02.uni_;

public class UniUser extends Person {
    String firstName;
    private String secondName;
    String uniID;
    int libraryCard;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getUniID() {
        return uniID;
    }

    public UniUser(String firstName) {
        this.firstName = firstName;
    }

    public UniUser(int libraryCard,String firstName, String secondName,String uniID) {
        this.libraryCard = libraryCard;
        this.firstName=firstName;
        this.secondName=secondName;
        this.uniID=uniID;

    }


    public UniUser(String uniID, int age) {
        this.uniID = uniID;
        this.age = age;
    }
    public UniUser(String firstName, String secondName, String uniID) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;

    }

    public UniUser(String firstName, String secondName, String uniID, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.uniID = uniID;
        this.age = age;
    }

    protected void eats() {
        System.out.println("В столовой все цены со скидкой. Скидка = ");
    }

    private void walks() {
        System.out.println("Ходит по кампусу");
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", uniID='" + uniID + '\'' +
                ", age=" + age +
                '}';
    }
    private static void uniUsersSort(UniUser[] input) {
        for (int i = 1; i < input.length; i++) {
            UniUser temp = input[i];
            for (int j = i; j > 0; j--) {
                if (input[j].getAge() < input[j - 1].getAge()) {
                    input[j] = input[j - 1];
                    input[j - 1] = temp;
                } else if (input[j].getAge() > input[j - 1].getAge()) {
                    break;
                }
            }
        }
    }

}
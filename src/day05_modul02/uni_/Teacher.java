package day05_modul02.uni_;

public class Teacher extends UniUser {
    private String subject;
    private String position;
    private String range;
    private String degree;

    public Teacher(String firstName) {
        super(firstName);
    }

    public Teacher(String firstName, String secondName, String uniID, int age, String range) {
        super(firstName, secondName, uniID, age);
        this.range = range;
    }

    public void teach()
    {
        System.out.println("Должен учиться, учиться и ещё раз учиться!");
    }
}
